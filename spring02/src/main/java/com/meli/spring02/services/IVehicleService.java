package com.meli.spring02.services;

import com.meli.spring02.dto.VehicleDto;
import com.meli.spring02.models.Vehicle;

import java.util.List;

public interface IVehicleService {
//  Vehicle getVehicle(String licensePlate);
    VehicleDto getVehicle(String licensePlate);

//  List<Vehicle> getAllVehicle();
    List<VehicleDto> getAllVehicle();

    void saveVehicle(Vehicle newVehicle);

    List<VehicleDto> getAllByPriceOrder();
    List<VehicleDto> getAllByModelOrder();
    List<VehicleDto> getByModel(String model);
}
