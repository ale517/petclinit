package com.alejandro.rojas.petclinic.services;
import com.alejandro.rojas.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
