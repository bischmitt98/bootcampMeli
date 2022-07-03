package oop.oop09;

import oop.oop09.models.Garage;
import oop.oop09.models.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("Fiesta", "Ford", 1000));
        vehicles.add(new Vehicle("Focus", "Ford", 1200));
        vehicles.add(new Vehicle("Explorer", "Ford", 2500));
        vehicles.add(new Vehicle("Uno", "Fiat", 500));
        vehicles.add(new Vehicle("Cronos", "Fiat", 1000));
        vehicles.add(new Vehicle("Torino", "Fiat", 1250));
        vehicles.add(new Vehicle("Aveo", "Chevrolet", 1250));
        vehicles.add(new Vehicle("Spin", "Chevrolet", 2500));
        vehicles.add(new Vehicle("Corola", "Toyota", 1200));
        vehicles.add(new Vehicle("Fortuner", "Toyota", 3000));
        vehicles.add(new Vehicle("Logan", "Renault", 950));

        // Vehicles list
        //vehicles.stream().forEach(System.out::println);

        // Vehicles filter per price
        vehicles.stream()
                .sorted()
                .forEach(vehicle -> System.out.println(vehicle.getModel() + ", " + vehicle.getPrice()));

        // Two ways of sorting with Strings
        vehicles.stream()
                .sorted((a, b) -> CharSequence.compare(a.getBrand(), b.getBrand()))
                .forEach(vehicle -> System.out.println(vehicle.getBrand() + ", " + vehicle.getModel()));

        vehicles.stream()
                .sorted(Comparator.comparing(Vehicle::getBrand)).collect(Collectors.toList())
                .forEach(vehicle -> System.out.println(String.format(vehicle.getBrand() + ", " + vehicle.getModel())));



        // Print the price average
        System.out.println("The average is: $" + vehicles.stream().mapToDouble(vehicle -> vehicle.getPrice()).average().orElse(0.0));
    }
}
