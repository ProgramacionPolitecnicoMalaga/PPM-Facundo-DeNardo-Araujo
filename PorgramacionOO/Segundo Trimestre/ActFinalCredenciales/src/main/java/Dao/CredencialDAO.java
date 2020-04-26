package Dao;

import Modelo.Credencial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CredencialDAO {
    Connection conn = new Connection();
    java.sql.Connection dbConn = conn.getDbConn();

    public CredencialDAO() throws SQLException {
    }

    public void registrarCredenccial(String nombre, String hash, String algoritmo, String salt) throws SQLException {
        dbConn.prepareStatement("INSERT INTO Credenciales(nombre, hash, algoritmo, salt) VALUES('"+nombre+"', '"+hash+"', '"+algoritmo+"', '"+salt+"')").executeUpdate();
    }

    public ArrayList devolverCredencialesBBDD() throws SQLException {
        ArrayList<Credencial> credenciales = new ArrayList<>();
       ResultSet rs = dbConn.prepareStatement("SELECT * FROM Credenciales").executeQuery();
       while(rs.next()){
           Credencial cred = new Credencial(rs.getString("id"), rs.getString("nombre"), rs.getString("hash"), rs.getString("algoritmo"), rs.getString("salt"));
           credenciales.add(cred);
       }
       return credenciales;
    }

    public void borrarItem(String Id) throws SQLException {
        dbConn.prepareStatement("DELETE FROM Credenciales WHERE id = " + Id).executeUpdate();
    }

    public Credencial buscarCredencialById(String id) throws SQLException {
        Credencial cred = null;
        ResultSet rs = dbConn.prepareStatement("SELECT * FROM Credenciales WHERE id LIKE '" + id + "'").executeQuery();
        while (rs.next()){
            cred = new Credencial(rs.getString("id"), rs.getString("nombre"), rs.getString("hash"), rs.getString("algoritmo"), rs.getString("salt"));
        }
        return cred;
    }

    public Credencial buscarCredencialByNombre(String usuario) throws SQLException {
        Credencial cred = null;
        ResultSet rs = dbConn.prepareStatement("SELECT * FROM Credenciales WHERE nombre LIKE '" + usuario + "'").executeQuery();
        while (rs.next()){
            cred = new Credencial(rs.getString("id"), rs.getString("nombre"), rs.getString("hash"), rs.getString("algoritmo"), rs.getString("salt"));
        }
        return cred;
    }


}
