package com.niteshb.nitpetclinic.services;

import com.niteshb.nitpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findByID(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
