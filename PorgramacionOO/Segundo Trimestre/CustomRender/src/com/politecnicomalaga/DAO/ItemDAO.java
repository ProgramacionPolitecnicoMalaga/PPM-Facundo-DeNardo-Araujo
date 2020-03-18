package com.politecnicomalaga.DAO;

import com.politecnicomalaga.Modelo.Item;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ItemDAO {
    Connection conn = new Connection();
    java.sql.Connection dbConn = conn.getDbConn();

    public ItemDAO() throws SQLException {
    }

    public void addItemOnBBDD(String nombre, String fecha, String texto, String tema) throws SQLException {
        dbConn.prepareStatement("INSERT INTO item(autor, fecha, texto, tema) VALUES('"+nombre+"', '"+fecha+"', '"+texto+"', '"+tema+"')").executeUpdate();
    }

    public ArrayList devolverItemsBBDD() throws SQLException {
        ArrayList<Item> items = new ArrayList<>();
        ResultSet rs = dbConn.prepareStatement("SELECT * FROM item").executeQuery();
        while (rs.next()){
            String fecha = rs.getString("fecha");
            String[] fechaDividida = fecha.split("-");
            String año = fechaDividida[0];
            String mes = fechaDividida[1];
            String dia = fechaDividida[2];
            Item it = new Item(rs.getString("autor"),LocalDate.of(Integer.parseInt(año),Integer.parseInt(mes),Integer.parseInt(dia)),rs.getString("texto"),rs.getString("tema"));
            it.setId(rs.getString("id"));
            items.add(it);
        }
        return items;
    }

    public void borrarItem(String Id) throws SQLException {
        dbConn.prepareStatement("DELETE FROM item WHERE id = " + Id).executeUpdate();
    }
}
