package com.politecnico;

public class AvanceTareas {
    private Tareas tareas = Tareas.getInstance();

    public void avanzar(int numeroDeTareas){
        if (numeroDeTareas >= 0)
            tareas.cambiarUltimaTareaRealizada(numeroDeTareas);
        else System.out.println("Introduce un numero POSITIVO");
    }

    public String mostrarUltimaTarea(){
        return tareas.getUltimaTareRealizada();
    }

}
