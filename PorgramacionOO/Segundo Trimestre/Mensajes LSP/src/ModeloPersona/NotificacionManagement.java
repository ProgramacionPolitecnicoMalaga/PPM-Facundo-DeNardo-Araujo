package ModeloPersona;

import ModeloMensaje.Notificacion;

public interface NotificacionManagement {
    public Notificacion enviarNotificacion(String mensaje, Persona persona);
}
