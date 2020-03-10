package com.politecnicomalaga.DAO;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    String db = "Empelados";
    String url = "jdbc:mysql://51.77.146.122:3306/" + db;
    String usuario = "empleadosuser";
    String password = "12345678910";
    java.sql.Connection dbConn = DriverManager.getConnection(url, usuario, password);

    public Connection() throws SQLException {

    }

    public java.sql.Connection getDbConn() {
        return dbConn;
    }

    public void setDbConn(java.sql.Connection dbConn) {
        this.dbConn = dbConn;
    }
}