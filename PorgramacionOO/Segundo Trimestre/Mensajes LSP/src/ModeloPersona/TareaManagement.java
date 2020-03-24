package ModeloPersona;

import ModeloMensaje.Tarea;

public interface TareaManagement {
    public Tarea enviarTarea(String mensaje, Persona persona);
}
