package com.meli.spring02.services;

import com.meli.spring02.dto.VehicleDto;
import com.meli.spring02.models.Vehicle;
import com.meli.spring02.repositories.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleService implements IVehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

//    @Override
//    public Vehicle getVehicle(String licensePlate) {
//        return vehicleRepo.getVehicle(licensePlate);
//    }

    @Override
    public VehicleDto getVehicle(String licensePlate) {
        VehicleDto vehicleDto = new VehicleDto(vehicleRepo.getVehicle(licensePlate));
        return vehicleDto;
    }


    @Override
    public List<VehicleDto> getAllVehicle() {
        List<Vehicle> vehicleList = vehicleRepo.getAllVehicle();
        List<VehicleDto> vehicleDtoList = vehicleList.stream()
//                .map(v->new VehicleDto(v)).collect(Collectors.toList());
                .map(VehicleDto::new).collect(Collectors.toList());
        return vehicleDtoList;
    }

    @Override
    public void saveVehicle(Vehicle newVehicle) {
        vehicleRepo.saveVehicle(newVehicle);
    }

    @Override
    public List<VehicleDto> getAllByPriceOrder() {
        List<Vehicle> vehicleList = vehicleRepo.getAllVehicle();
        return vehicleList.stream()
                .sorted()
                .map(VehicleDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<VehicleDto> getAllByModelOrder() {
        List<Vehicle> vehicleList = vehicleRepo.getAllVehicle();
        return vehicleList.stream()
                .sorted((v1, v2) -> v1.getModel().compareTo(v2.getModel()))
//                .sorted(Comparator.comparing(Vehicle::getModel))
                .map(VehicleDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<VehicleDto> getByModel(String model) {
        List<Vehicle> vehicleList = vehicleRepo.getAllVehicle();
        return vehicleList.stream()
                .filter(v -> v.getModel().equals(model))
                .map(VehicleDto::new)
                .collect(Collectors.toList());
    }
}
