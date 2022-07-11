package com.meli.spring02.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    private int id;
    private String name, telephone;
    private List<Vehicle> vehicles;
}
