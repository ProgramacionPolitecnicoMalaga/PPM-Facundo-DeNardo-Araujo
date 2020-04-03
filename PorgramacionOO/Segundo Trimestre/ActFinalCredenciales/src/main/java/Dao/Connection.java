package Dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    LectorENV lectorENV = new LectorENV();
    String db = lectorENV.getName();
    String url = "jdbc:mysql://51.77.146.122:3306/" + db;
    String usuario = lectorENV.getUser();
    String password = lectorENV.getPass();
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