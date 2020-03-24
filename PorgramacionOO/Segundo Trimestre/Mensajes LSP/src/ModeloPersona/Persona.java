package ModeloPersona;

import ModeloMensaje.Etiqueta;

public class Persona {
    String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void leerEtiqueta(Etiqueta etiqueta){
        System.out.println(etiqueta.getMensaje());
    }
}
