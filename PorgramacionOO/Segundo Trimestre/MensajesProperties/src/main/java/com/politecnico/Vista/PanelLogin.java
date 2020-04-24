package com.politecnico.Vista;

import Controlador.ControladorCredencialesDAO;
import Dao.CredencialDAO;
import Modelo.Credencial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class PanelLogin {
    private JPanel pnlLogIn;
    private JTextField txtUsuario;
    private JPasswordField txtPass;
    private JButton btnAceptar;
    private CredencialDAO credencialDAO = new CredencialDAO();

    public JPanel getPnlLogIn(){
        return pnlLogIn;
    }

    public PanelLogin() throws SQLException {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    ArrayList as = credencialDAO.devolverCredencialesBBDD();
                    System.out.println(as);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }
}
