package com.politecnico;

import java.lang.reflect.Array;

public class Robot {
    Coordenadas coordenadas;
    private String nombre;

    public Robot(String nombre, Coordenadas posicionInicial){
        this.nombre = nombre;
        this.coordenadas = posicionInicial;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCoordenadas(Coordenadas coordenadas){
        this.coordenadas = coordenadas;
    }

    public Coordenadas getCoordenadas(){
        return coordenadas;
    }
}