package com.niteshb.nitpetclinic.repositories;

import com.niteshb.nitpetclinic.models.Speciality;
import com.niteshb.nitpetclinic.models.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
