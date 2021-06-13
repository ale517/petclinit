package com.alejandro.rojas.petclinic.services.map;

import com.alejandro.rojas.petclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService <T, ID> implements CrudService<T,ID> {
    protected Map<ID, T>  map= new HashMap<>();
    
    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id){
        return map.get(id);
    }

    public T Save (ID id, T object){
        map.put(id,object);
        return object;
    }

    public void deleteByID(ID id){
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    }
