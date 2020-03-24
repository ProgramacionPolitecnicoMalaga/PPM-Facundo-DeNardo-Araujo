package ModeloMensaje;
import ModeloPersona.Persona;

public class Tarea extends Mensaje {
    private boolean terminada;
    private Persona persona;


    public Tarea(String mensaje, Persona persona) {
        super(mensaje);
        terminada = false;
        this.persona = persona;
    }
}
