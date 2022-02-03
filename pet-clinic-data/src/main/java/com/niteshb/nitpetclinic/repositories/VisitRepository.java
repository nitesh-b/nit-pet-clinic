package com.niteshb.nitpetclinic.repositories;

import com.niteshb.nitpetclinic.models.Vet;
import com.niteshb.nitpetclinic.models.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
