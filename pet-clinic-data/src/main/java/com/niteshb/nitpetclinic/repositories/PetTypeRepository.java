package com.niteshb.nitpetclinic.repositories;

import com.niteshb.nitpetclinic.models.Pet;
import com.niteshb.nitpetclinic.models.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
