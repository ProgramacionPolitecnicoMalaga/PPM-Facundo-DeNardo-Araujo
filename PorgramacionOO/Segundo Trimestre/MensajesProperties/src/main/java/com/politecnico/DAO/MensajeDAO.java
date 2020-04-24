package com.politecnico.DAO;

import Dao.Connection;

import java.sql.SQLException;

public class MensajeDAO {
    Connection connection = new Connection();
    java.sql.Connection dbConn = connection.getDbConn();

    public MensajeDAO() throws SQLException {
    }

    public void registrarMensaje(int emisor, String mensaje, int receptor, String titulo) throws SQLException {
        dbConn.prepareStatement("INSERT INTO Mensajes(emisor, mensaje, receptor, titulo) VALUES('"+emisor+"', '"+mensaje+"', '"+receptor+"' '"+titulo+"')").executeUpdate();
    }

    public void devolverMensajesPorId(){

    }
}
