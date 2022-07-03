package oop.oop09.models;


public class Vehicle implements Comparable<Vehicle> {
    private String model, brand;
    private double price;

    public Vehicle(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Vehicle vehicle){
        if(this.price < vehicle.getPrice()){
            return -1;
        }if (this.price > vehicle.getPrice()){
            return 1;
        }else{
            return 0;
        }
    }
}
