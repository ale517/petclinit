package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.model.Vet;
import com.alejandro.rojas.petclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.Save(object.getId(), object);
    }
}
