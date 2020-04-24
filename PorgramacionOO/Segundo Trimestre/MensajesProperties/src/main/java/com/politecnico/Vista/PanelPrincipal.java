package com.politecnico.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class PanelPrincipal {
    private JPanel panel1;
    private JPanel pnlPrincipal;
    private JMenuBar Menu;
    private JMenu Acciones;
    private JMenuItem menEscribir;
    private JMenuItem menLeer;
    private JMenuItem logOut;
    PanelLectura panelLectura = new PanelLectura();
    PanelEscritura panelEscritura = new PanelEscritura();
    PanelLogin panelLogin = new PanelLogin();

    public JPanel getPanel(){
        return panel1;
    }

    public JPanel getPnlPrincipal(){
        return pnlPrincipal;
    }

    public PanelPrincipal() throws SQLException {

        pnlPrincipal.add(panelLectura.getPanel(),"Lectura");
        pnlPrincipal.add(panelEscritura.getPanel(),"Escritura");
        pnlPrincipal.add(panelLogin.getPnlLogIn(),"LogIn");

        mostrarLectura();


        menLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mostrarLectura();
            }
        });

        menEscribir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mostrarEscritura();
            }
        });

        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mostrarLogOut();
            }
        });


    }

    public void mostrarEscritura(){
        CardLayout cardLayout = (CardLayout) pnlPrincipal.getLayout();
        cardLayout.show(pnlPrincipal, "Escritura");
        menEscribir.setEnabled(false);
        menLeer.setEnabled(true);
    }
    public void mostrarLectura(){
        CardLayout cardLayout = (CardLayout) pnlPrincipal.getLayout();
        cardLayout.show(pnlPrincipal, "Lectura");
        menLeer.setEnabled(false);
        menEscribir.setEnabled(true);
    }
    public void mostrarLogOut(){
        CardLayout cardLayout = (CardLayout) pnlPrincipal.getLayout();
        cardLayout.show(pnlPrincipal, "LogIn");
        menEscribir.setEnabled(false);
        menLeer.setEnabled(false);
    }
}
