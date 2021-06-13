package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.model.Owner;


public class OnwerServiceMap extends AbstractMapService<Owner,Long> {
    @Override
    public Owner save(Owner object) {
        return super.Save(object.getId(), object);
    }
}
