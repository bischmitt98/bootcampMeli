package com.meli.spring02.dto;

import com.meli.spring02.models.Vehicle;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VehicleDto {
    private String licensePlate;
    private String model;
    private double price;

    public VehicleDto(Vehicle vehicle) {
        this.licensePlate = getLicensePlate();
        this.model = getModel();
        this.price = getPrice();
    }
}
