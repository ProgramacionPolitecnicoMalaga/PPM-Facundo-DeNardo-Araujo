package ModeloPersona;

import ModeloMensaje.Notificacion;

public class Participante extends Persona implements NotificacionManagement{


    public Participante(String nombre) {
        super(nombre);
    }

    @Override
    public Notificacion enviarNotificacion(String mensaje, Persona persona) {
        Notificacion not = new Notificacion(mensaje,persona);
        return not;
    }
}
