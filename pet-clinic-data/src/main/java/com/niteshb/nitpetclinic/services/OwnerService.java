package com.niteshb.nitpetclinic.services;

import com.niteshb.nitpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
