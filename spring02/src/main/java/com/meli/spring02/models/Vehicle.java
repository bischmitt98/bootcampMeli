package com.meli.spring02.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle implements Comparable<Vehicle> {
    private String licensePlate;
    private String model;
    private double price;
    private String renavam;
    private int id_owner;

    @Override
    public int compareTo(Vehicle other) {
        if(this.price > other.getPrice())
            return 1;

        if(this.price < other.getPrice())
            return -1;
        return 0;

        //return (int)(this.price - other.getPrice());
    }

}
