package com.meli.spring02.controllers;

import com.meli.spring02.models.Owner;
import com.meli.spring02.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/all")
    public ResponseEntity<List<Owner>> getAllVehicle(){
        List<Owner> list = ownerService.getAllOwners();
        return ResponseEntity.ok(list);
    }
}
