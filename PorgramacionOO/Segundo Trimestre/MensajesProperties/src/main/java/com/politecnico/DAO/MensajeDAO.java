package com.politecnico.DAO;

import Dao.Connection;
import com.politecnico.Modelo.Mensaje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MensajeDAO {

    Connection connection = new Connection();
    java.sql.Connection dbConn = connection.getDbConn();

    public MensajeDAO() throws SQLException {
    }

    public int registrarMensaje(int emisor, String mensaje, int receptor, String titulo) throws SQLException {
        int resultado = dbConn.prepareStatement("INSERT INTO Mensajes(emisor, mensaje, receptor, titulo) VALUES("+emisor+", '"+mensaje+"', "+receptor+", '"+titulo+"')").executeUpdate();
        return resultado;
    }

    public ArrayList<Mensaje> devolverMensajesPorId(int id) throws SQLException {
        ArrayList<Mensaje> mensajes = new ArrayList<>();
        ResultSet rs = dbConn.prepareStatement("SELECT * FROM Mensajes WHERE Receptor = " + id).executeQuery();
        while (rs.next())
            mensajes.add(new Mensaje(rs.getString("Emisor"),rs.getString("Receptor"),rs.getString("titulo"),rs.getString("Mensaje")));
        return mensajes;
    }
}
