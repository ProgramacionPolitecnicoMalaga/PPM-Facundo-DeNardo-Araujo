package com.politecnico;

import java.util.ArrayList;

public class Tareas {
    private static Tareas instancia = null;
    private ArrayList<String> tareas;
    private Integer ultimaTareaRealizada = null;

    public Tareas(){
        tareas = new ArrayList<>();
    }

    public static Tareas getInstance(){
        if (instancia == null)
            instancia = new Tareas();
        return instancia;
    }

    public void addTarea(String tarea){
        tareas.add(tarea);
    }

    public String getUltimaTareRealizada(){
            if (ultimaTareaRealizada == null)
                ultimaTareaRealizada = tareas.size() - 1;
            return tareas.get(ultimaTareaRealizada);
    }

    public void cambiarUltimaTareaRealizada(int numeroDeTarea){
            if (!((numeroDeTarea + ultimaTareaRealizada) > tareas.size()) && numeroDeTarea > 0)
                ultimaTareaRealizada += numeroDeTarea;
            if ((tareas.size() - 1) - Math.abs(numeroDeTarea) < tareas.size() && numeroDeTarea < 0)
                ultimaTareaRealizada = ultimaTareaRealizada - (Math.abs(numeroDeTarea));
    }
}
