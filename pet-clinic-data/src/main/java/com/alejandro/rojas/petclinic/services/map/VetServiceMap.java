package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.model.Vet;

public class VetServiceMap extends AbstractMapService<Vet,Long>{
    @Override
    public Vet save(Vet object) {
        return super.Save(object.getId(), object);
    }
}
