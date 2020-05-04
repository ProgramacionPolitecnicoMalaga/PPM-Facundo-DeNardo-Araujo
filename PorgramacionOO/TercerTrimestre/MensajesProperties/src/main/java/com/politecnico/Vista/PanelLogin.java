package com.politecnico.Vista;

import com.politecnico.Configuracion.Propiedades;
import com.politecnico.Controlador.ControladorUsuarios;
import com.politecnico.Modelo.LoggedUser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class PanelLogin {
    private JPanel pnlLogIn;
    private JTextField txtUsuario;
    private JPasswordField txtPass;
    private JButton btnAceptar;
    private ControladorUsuarios controladorUsuarios = new ControladorUsuarios();
    private LoggedUser loggedUser = LoggedUser.getInstance();
    private PanelPrincipal panelPrincipal;
    private Propiedades propiedades = new Propiedades();

    public PanelLogin(PanelPrincipal panelPadre) throws SQLException, IOException {
        txtUsuario.setText(propiedades.getPropiedad("usuario"));
        txtPass.setText(propiedades.getPropiedad("pass"));
        this.panelPrincipal = panelPadre;
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                logIn();
            }
        });
    }

    public JPanel getPnlLogIn(){
        return pnlLogIn;
    }

    public void logIn(){
        try {
            propiedades.recordarUsuario(txtUsuario.getText(),String.valueOf(txtPass.getPassword()));
            boolean acceso = controladorUsuarios.concederAcceso(txtUsuario.getText(),String.valueOf(txtPass.getPassword()));
            loggedUser.setCredencial(controladorUsuarios.obtenerCredencialPorNombre(txtUsuario.getText()));
            if (acceso)
                panelPrincipal.mostrarLectura();
            else JOptionPane.showMessageDialog(null,"Contraseña invalida", "Error", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/main/resources/noVálida.png"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logOut(){

    }

}
