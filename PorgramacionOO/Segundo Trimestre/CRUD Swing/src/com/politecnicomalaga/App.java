package com.politecnicomalaga;
import com.politecnicomalaga.Vista.Principal;
import javax.swing.*;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        Principal principal = new Principal();
        JFrame frame = new JFrame("Empleados");
        frame.setContentPane(principal.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);




    }
}
