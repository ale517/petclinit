package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.model.Pet;
import com.alejandro.rojas.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

}
