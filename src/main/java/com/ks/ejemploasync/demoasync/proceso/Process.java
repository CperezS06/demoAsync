package com.ks.ejemploasync.demoasync.proceso;

import com.ks.ejemploasync.demoasync.model.Persona;
import com.ks.ejemploasync.demoasync.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@EnableAsync
public class Process
{
    @Autowired
    PersonaService personaService;

    @Async()
    public void metodAsync(int i){
        Random RANDOM = new Random();
        int value = RANDOM.nextInt(100);
        try
        {
            Thread.sleep(value);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Metodo Async: " + Thread.currentThread().getName() + " Numero recibido: "+i);
    }

    //@Async()
    public void guardaPersona(){
        Persona persona = new Persona(1,"cesar", 27, "nicolas romero", "5547737616");
        personaService.save(persona);
    }

    public void leerPersona(){
        String lista = personaService.findAll().toString();
        System.out.println(lista);
    }

    public void eliminaPersona(int id){
        personaService.deleteById(id);
    }
    public void eliminarTodo(){
        personaService.deleteAll();
    }

}
