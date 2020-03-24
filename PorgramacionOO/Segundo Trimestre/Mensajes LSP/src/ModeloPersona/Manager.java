package ModeloPersona;
import ModeloMensaje.Notificacion;
import ModeloMensaje.Tarea;

public class Manager extends Persona implements NotificacionManagement, TareaManagement {

    public Manager(String nombre) {
        super(nombre);
    }


    @Override
    public Notificacion enviarNotificacion(String mensaje, Persona persona) {
        Notificacion not = new Notificacion(mensaje, persona);
        return not;
    }

    @Override
    public Tarea enviarTarea(String mensaje, Persona persona) {
        Tarea tarea = new Tarea(mensaje, persona);
        return tarea;
    }
}
