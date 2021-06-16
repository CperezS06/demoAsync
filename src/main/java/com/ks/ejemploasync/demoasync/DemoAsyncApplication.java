package com.ks.ejemploasync.demoasync;

import com.ks.ejemploasync.demoasync.proceso.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAsyncApplication implements ApplicationRunner
{
    @Autowired
    private Process process;

    public static void main(String[] args)
    {
        SpringApplication.run(DemoAsyncApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args)
    {
        /*System.out.println("Hilo main: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++)
        {
            process.metodAsync(i);
        }
        System.out.println("Finaliza hilo main");*/


        System.out.printf("Guarda persona\n");
        process.guardaPersona();
        System.out.printf("\nPersonas registradas\n");
        process.leerPersona();


        //System.out.printf("\nElimina persona con id 1\n");
        //process.eliminaPersona(1);
        //System.out.printf("\nPersonas registradas\n");
        //process.leerPersona();

        /*for (int i = 0; i < 50; i++)
        {
            Persona persona = new Persona(i, "cesar", 27, "nicolas romero", "5547737616");
            process.guardaPersona(persona);
        }

        for (int i = 50; i < 100; i++)
        {
            Persona persona = new Persona(i, "cesar", 27, "nicolas romero", "5547737616");
            process.guardaPersona(persona);
        }*/
        //process.leerPersona();
        //process.eliminarTodo();
    }
}
