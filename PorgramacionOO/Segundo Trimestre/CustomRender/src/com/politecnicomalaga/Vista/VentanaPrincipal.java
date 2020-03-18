package com.politecnicomalaga.Vista;

import com.politecnicomalaga.DAO.ItemDAO;
import com.politecnicomalaga.Modelo.Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class VentanaPrincipal {
    private JPanel pnlMain;
    private JButton btnEliminar;
    private JButton btnNuevo;
    private JList lstItems;
    private VentanaPrincipal estaVentana;
    DefaultListModel<Item> lstModel = new DefaultListModel<>();
    private ArrayList<Item> items;
    private ItemDAO itemDAO = new ItemDAO();

    public VentanaPrincipal() throws SQLException {
        refresh();
        estaVentana = this;
        lstItems.setModel(lstModel);
        lstItems.setCellRenderer(new ItemPanel());
        lstItems.setFixedCellWidth(pnlMain.getWidth());
        lstItems.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Estiramos la celda a 1000 px de altura
                lstItems.setFixedCellHeight(1000);
                // Asignamos el valor -1 para que se recalcule la altura
                lstItems.setFixedCellHeight(-1);
            }
        });
        btnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Añadir añadir = new Añadir(estaVentana);
                    añadir.setLocationRelativeTo(SwingUtilities.getRoot((Component) e.getSource()));
                    añadir.pack();
                    añadir.setVisible(true);
                    lstModel.addElement(añadir.getItem());
                    refresh();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = lstItems.getSelectedIndex();
                Item it = (Item) lstModel.getElementAt(index);
                try {
                    int respuesta = JOptionPane.showConfirmDialog(SwingUtilities.getRoot((Component) e.getSource()),"¿Esta seguro que desa continuar?");
                    if (respuesta == JOptionPane.OK_OPTION){
                        itemDAO.borrarItem(it.getId());
                        refresh();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public Container getPanel() {
        return pnlMain;
    }

    public void refresh() throws SQLException {
        items = itemDAO.devolverItemsBBDD();
        lstModel.clear();
        for (Item it : items){
            lstModel.addElement(it);
        }
    }

}
