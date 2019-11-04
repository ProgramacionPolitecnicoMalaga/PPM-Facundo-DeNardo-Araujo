package com.politecnico;

public class Superclase {
    public void saludo(){
        System.out.println("Hola soy la superclase");
    }
    public Superclase(){
        System.out.println("constructor SuperClase");
    }
    public Superclase(String mensaje){
        System.out.println("constructor - superclase - " + mensaje);
    }
}
