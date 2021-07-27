package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.model.Owner;
import com.alejandro.rojas.petclinic.services.OwnerService;


public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner save(Owner object) {
        return super.Save(object.getId(), object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
