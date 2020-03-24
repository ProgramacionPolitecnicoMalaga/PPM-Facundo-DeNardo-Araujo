package ModeloMensaje;

import ModeloPersona.Persona;

public class Notificacion extends Mensaje {
    private boolean leido;
    private Persona persona;

    public Notificacion(String mensaje, Persona persona) {
        super(mensaje);
        leido = false;
        this.persona = persona;
    }
}
