package com.alejandro.rojas.petclinic.services;

import com.alejandro.rojas.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName();

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
