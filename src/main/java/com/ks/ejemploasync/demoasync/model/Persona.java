package com.ks.ejemploasync.demoasync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persona")
public class Persona
{
    @Id
    Integer id;
    String nombre;
    Integer edad;
    String direccion;
    String telefono;
}
