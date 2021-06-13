package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.model.Pet;

public class PetServiceMap extends AbstractMapService<Pet,Long>{
    @Override
    public Pet save(Pet object) {
        return super.Save(object.getId(), object);
    }
}
