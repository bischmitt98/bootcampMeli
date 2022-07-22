package com.meli.spring02.repositories;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.meli.spring02.exception.NotFoundException;
import com.meli.spring02.models.Vehicle;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class VehicleRepo {
    private final String LINKFILE = "src/main/resources/vehicle.json";

    public Vehicle getVehicle(String licensePlate) {
        ObjectMapper mapper = new ObjectMapper();
        List<Vehicle> list = null;

        try {
            list = Arrays.asList(mapper.readValue(new File(LINKFILE), Vehicle[].class));

        } catch (Exception ex) {

        }

        for (Vehicle v : list) {
            if (v.getLicensePlate().equals(licensePlate)) {
                return v;
            }
        }
        throw new NotFoundException("Vehicle not found!");
//        return null;
    }

    public List<Vehicle> getAllVehicle() {
        ObjectMapper mapper = new ObjectMapper();
        List<Vehicle> list = null;

        try {
            list = Arrays.asList(mapper.readValue(new File(LINKFILE), Vehicle[].class));
        } catch (Exception ex) {

        }
        return list;
    }

    public void saveVehicle(Vehicle newVehicle) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<Vehicle> currentList = null;

        try {
            currentList = Arrays.asList
                    (mapper.readValue(new File(LINKFILE), Vehicle[].class));
            List<Vehicle> copyList = new ArrayList<>(currentList);
            copyList.add(newVehicle);
            writer.writeValue(new File(LINKFILE), copyList);
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }
}
