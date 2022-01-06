package com.niteshb.nitpetclinic.services;

import com.niteshb.nitpetclinic.models.Owner;
import com.niteshb.nitpetclinic.models.Pet;

import java.util.Set;

public interface PetService {
    Pet findByID(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
