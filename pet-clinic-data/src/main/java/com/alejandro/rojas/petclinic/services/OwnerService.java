package com.alejandro.rojas.petclinic.services;

import com.alejandro.rojas.petclinic.model.Owner;

public interface OwnerService extends  CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
