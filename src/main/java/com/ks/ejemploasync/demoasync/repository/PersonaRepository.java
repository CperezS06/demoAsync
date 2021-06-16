package com.ks.ejemploasync.demoasync.repository;

import com.ks.ejemploasync.demoasync.model.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PersonaRepository extends CrudRepository<Persona, Integer>
{
    Persona save(Persona persona);

    ArrayList<Persona> findAll();

    @Override
    void deleteById(Integer integer);

    void deleteAll();
}
