package com.politecnico.Controlador;

import com.politecnico.DAO.MensajeDAO;
import com.politecnico.Modelo.Mensaje;

import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorMensajes {
    private ArrayList<Mensaje> mensajes = new ArrayList<>();
    private MensajeDAO mensajeDAO = new MensajeDAO();

    public ControladorMensajes() throws SQLException {

    }

    public ArrayList mensajesPorId(int id) throws SQLException {
        return mensajes = mensajeDAO.devolverMensajesPorId(id);
    }

    public int enviarMensaje(int emisor, String mensaje, int receptor, String titulo) throws SQLException {
        int resultado = mensajeDAO.registrarMensaje(emisor,mensaje,receptor,titulo);
        return resultado;
    }
}
