package com.niteshb.nitpetclinic.services;

import com.niteshb.nitpetclinic.models.Pet;
import com.niteshb.nitpetclinic.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findByID(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
