package oop.oop09.models;

import oop.oop09.models.Vehicle;

import java.util.ArrayList;

public class Garage {
    private long id;
    private ArrayList<Vehicle> vehicleList;

    public Garage(long id, ArrayList<Vehicle> vehicleList) {
        this.id = id;
        this.vehicleList = vehicleList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
