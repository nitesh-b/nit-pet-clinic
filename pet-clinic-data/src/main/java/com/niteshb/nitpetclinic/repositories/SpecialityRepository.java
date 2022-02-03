package com.niteshb.nitpetclinic.repositories;

import com.niteshb.nitpetclinic.models.PetType;
import com.niteshb.nitpetclinic.models.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
