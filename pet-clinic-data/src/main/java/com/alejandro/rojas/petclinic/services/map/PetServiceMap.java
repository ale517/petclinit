package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.model.Pet;
import com.alejandro.rojas.petclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Pet save(Pet object) {
        return super.Save(object.getId(), object);
    }
}
