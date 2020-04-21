package com.politecnico;

public class App {
    public static void main(String[] args) {
        Tareas tareas = Tareas.getInstance();
        tareas.addTarea("Tarea 0");
        tareas.addTarea("Tarea 1");
        tareas.addTarea("Tarea 2");
        tareas.addTarea("Tarea 3");
        tareas.addTarea("Tarea 4");
        tareas.addTarea("Tarea 5");

        System.out.println(tareas.getUltimaTareRealizada());

        RetrocederTareas retrocederTareas = new RetrocederTareas();
        retrocederTareas.retroceder(-3);
        System.out.println(retrocederTareas.mostrarUltimaTarea());

        AvanceTareas avanceTareas = new AvanceTareas();
        avanceTareas.avanzar(1);
        System.out.println(avanceTareas.mostrarUltimaTarea());

    }
}
