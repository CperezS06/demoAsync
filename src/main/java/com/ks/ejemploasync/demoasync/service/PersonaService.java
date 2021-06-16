package com.ks.ejemploasync.demoasync.service;

import com.ks.ejemploasync.demoasync.model.Persona;
import com.ks.ejemploasync.demoasync.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class PersonaService
{
    @Autowired
    PersonaRepository personaRepository;

    public Persona save(Persona persona){
        return personaRepository.save(persona);
    }

    public ArrayList<Persona> findAll(){
        return personaRepository.findAll();
    }

    public void deleteById(int id){
        personaRepository.deleteById(id);
    }

    public void deleteAll(){
        personaRepository.deleteAll();
    }
}
