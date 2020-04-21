package com.politecnico;

public class RetrocederTareas {
    private Tareas tareas = Tareas.getInstance();

    public void retroceder(int numeroDeTareas){
            if (numeroDeTareas <= 0)
                tareas.cambiarUltimaTareaRealizada(numeroDeTareas);
            else System.out.println("Introduce un numero NEGATIVO");
    }

    public String mostrarUltimaTarea(){
        return tareas.getUltimaTareRealizada();
    }
}
