package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.model.Owner;
import com.alejandro.rojas.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
