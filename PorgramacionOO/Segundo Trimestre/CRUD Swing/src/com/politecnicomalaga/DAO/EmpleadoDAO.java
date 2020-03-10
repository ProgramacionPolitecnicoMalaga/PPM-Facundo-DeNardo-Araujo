package com.politecnicomalaga.DAO;
import com.politecnicomalaga.modelo.Empleado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpleadoDAO {
    Connection conn = new Connection();
    java.sql.Connection dbConn = conn.getDbConn();

    public EmpleadoDAO() throws SQLException {
    }

    public void registrarEmpleado(String nombre, String edad) throws SQLException {
        dbConn.prepareStatement("INSERT INTO Empleado(nombre, edad) VALUES('"+ nombre +"','" + edad +"')").executeUpdate();
    }

    public ArrayList<Empleado> devolverEmpleadosBBDD() throws SQLException {
        ArrayList<Empleado> empsRegistrados = new ArrayList<>();
        ResultSet rs = dbConn.prepareStatement("SELECT * FROM Empleado").executeQuery();
        while (rs.next()){
            Empleado emp = new Empleado(rs.getString("nombre"), Integer.parseInt(rs.getString("edad")));
            emp.setId(Integer.parseInt(rs.getString("id")));
            empsRegistrados.add(emp);
        }
        return empsRegistrados;
    }

    public void editarEmpleado(int id, String nombre, int edad) throws SQLException {
        dbConn.prepareStatement("UPDATE Empleado SET nombre ='" + nombre + "', edad = '" + edad + "' WHERE id =" + id).executeUpdate();
    }

    public void borrarEmpleado(int id) throws SQLException {
        dbConn.prepareStatement("DELETE FROM Empleado WHERE ID = " + id).executeUpdate();
    }


}
