package com.politecnico.Vista;

import com.politecnico.Controlador.ControladorMensajes;
import com.politecnico.Modelo.LoggedUser;
import com.politecnico.Modelo.Mensaje;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class PanelLectura {
    private JPanel Panel1;
    private JPanel PanelLectura;
    private JTextArea textArea1;
    private JList list1;
    private DefaultListModel<Mensaje> listModel = new DefaultListModel<>();
    private ControladorMensajes controladorMensajes = new ControladorMensajes();
    private LoggedUser loggedUser = LoggedUser.getInstance();

    public PanelLectura() throws SQLException {
        list1.setModel(listModel);
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                int index = list1.getSelectedIndex();
                try {
                    Mensaje mensajeSeleccionado = (Mensaje) listModel.getElementAt(index);
                    textArea1.setText(mensajeSeleccionado.getContenido());
                }catch (IndexOutOfBoundsException ex){}
            }
        });
    }


    public void mostrarMensajes() throws SQLException {
        listModel.clear();
        ArrayList<Mensaje> mensajes = controladorMensajes.mensajesPorId(Integer.parseInt(loggedUser.credencial.getId()));
        for (Object mens : mensajes)
            listModel.addElement((Mensaje) mens);
    }




    public JPanel getPanel(){
        return PanelLectura;
    }


}
