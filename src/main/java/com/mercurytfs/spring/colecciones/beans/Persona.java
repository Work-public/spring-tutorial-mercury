package com.mercurytfs.spring.colecciones.beans;

/**
 * Created by Gabe on 03/09/2016.
 */
public class Persona {
    private String nombre;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return new StringBuilder("nombre: ").append(nombre).append(", edad: ").append(edad).toString();
    }
}
