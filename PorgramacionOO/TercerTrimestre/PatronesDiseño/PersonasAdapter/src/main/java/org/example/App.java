package org.example;

import org.example.Modelo.Persona;
import org.example.Vista.Tabla;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        List<Persona> persona = crearLista();


        JFrame frame = new JFrame("Personas");
        frame.setContentPane(new Tabla(persona).getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static List<Persona> crearLista() {
        List<Persona> lista = new ArrayList<Persona>(){
            @Override
            public String toString() {
                String resultado = "\n-----------------------------------";
                resultado += "\nEstado de la lista";
                for (Persona persona: this)
                    resultado += "\n" + persona.toString();
                return resultado;
            }
        };

        lista.add(new Persona("Persona 1" ,"Apellido 1",12));
        lista.add(new Persona("Persona 2" ,"Apellido 2" ,12));
        lista.add(new Persona("Persona 3" ,"Apellido 3",12));
        return lista;
    }
}
