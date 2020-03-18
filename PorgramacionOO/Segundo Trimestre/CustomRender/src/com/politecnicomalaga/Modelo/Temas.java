package com.politecnicomalaga.Modelo;

import java.util.ArrayList;

public class Temas {
    ArrayList<String> temas;

    public Temas(){
        temas = new ArrayList<>();
        temas.add("IT");
        temas.add("Desarrollo");
        temas.add("Mantenimiento");
        temas.add("General");
    }
    public ArrayList<String> getTemas() {
        return temas;
    }

    public void addNuevoTema(String tema){
        temas.add(tema);
    }
}
