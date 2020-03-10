package com.politecnicomalaga.modelo;

public class Empleado {
    int id;
    String nombre;
    int edad;

    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + "NOMBRE: " + nombre + " | " + "EDAD: " + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
