package com.meli.spring02.services;

import com.meli.spring02.models.Owner;
import com.meli.spring02.repositories.OwnerRepo;
import com.meli.spring02.repositories.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService implements IOwnerService {

    @Override
    public List<Owner> getAllOwners() {
        return null;
    }
}
