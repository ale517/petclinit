package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.model.Vet;
import com.alejandro.rojas.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

}
