package com.niteshb.nitpetclinic.repositories;

import com.niteshb.nitpetclinic.models.Owner;
import com.niteshb.nitpetclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
