package com.meli.spring02.controllers;

import com.meli.spring02.dto.VehicleDto;
import com.meli.spring02.models.Vehicle;

import com.meli.spring02.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/{licensePlate}")
    public ResponseEntity<VehicleDto> getVehicle(@PathVariable String licensePlate) {
        return ResponseEntity.ok().body(vehicleService.getVehicle(licensePlate));
    }

    @GetMapping("/all")
    public ResponseEntity<List<VehicleDto>> getAllVehicle() {
        List<VehicleDto> list = vehicleService.getAllVehicle();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/allByPriceOrder")
    public ResponseEntity<List<VehicleDto>> getAllByPriceOrder() {
        List<VehicleDto> list = vehicleService.getAllVehicle();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/allByModel")
    public ResponseEntity<List<VehicleDto>> getAllByModelOrder() {
        List<VehicleDto> list = vehicleService.getAllVehicle();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/byModel/{model}")
    public ResponseEntity<List<VehicleDto>> getByModel(@PathVariable String model) {
        List<VehicleDto> list = vehicleService.getAllVehicle();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void saveVehicle(@RequestBody Vehicle newVehicle) {
        vehicleService.saveVehicle(newVehicle);
    }
}
