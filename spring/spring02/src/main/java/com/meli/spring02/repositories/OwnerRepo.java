package com.meli.spring02.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.spring02.models.Owner;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class OwnerRepo {
    private final String LINKFILE = "src/main/resources/owner.json";

    public List<Owner> getAllOwners() {
        ObjectMapper mapper = new ObjectMapper();
        List<Owner> list = null;

        try {
            list = Arrays.asList
                    (mapper.readValue(new File(LINKFILE), Owner[].class));

        } catch (Exception ex) {
            System.out.println("Error int the file " + LINKFILE);
        }
        return list;
    }
}
