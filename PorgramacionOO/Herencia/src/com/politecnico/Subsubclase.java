package com.politecnico;

public class Subsubclase extends Subclase {
    public Subsubclase(){
        System.out.println("constructor subsubclase");
    }
    public Subsubclase(String mensaje, int numero){
        super(mensaje);
        numero++;
        

    }
}
