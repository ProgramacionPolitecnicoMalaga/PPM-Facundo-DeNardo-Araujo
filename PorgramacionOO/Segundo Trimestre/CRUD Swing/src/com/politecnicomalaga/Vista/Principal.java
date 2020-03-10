package com.politecnicomalaga.Vista;

import com.politecnicomalaga.DAO.EmpleadoDAO;
import com.politecnicomalaga.modelo.Empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class Principal {
    private JList<Empleado> lstEmpleados;
    private JPanel panel1;
    private JButton btnRegistrar;
    private JButton btnBorrar;
    private JButton btnEditar;
    DefaultListModel listModel = new DefaultListModel();
    private ArrayList<Empleado> empleadosList;
    private Principal estaVentana;
    private EmpleadoDAO empleadoDAO;

    public Principal() throws SQLException {
        empleadoDAO = new EmpleadoDAO();
        estaVentana = this;
        lstEmpleados.setModel(listModel);
        refresh();
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    RegistrarEditar registrarEditar = new RegistrarEditar(estaVentana);
                    registrarEditar.ocultarEditarOpt();
                    registrarEditar.setTituloVentana("Registrar Empleado");
                    registrarEditar.setLocationRelativeTo(SwingUtilities.getRoot((Component) e.getSource()));
                    registrarEditar.pack();
                    registrarEditar.setVisible(true);
                    empleadosList = empleadoDAO.devolverEmpleadosBBDD();
                    refresh();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = lstEmpleados.getSelectedIndex();
                Empleado empSelected = (Empleado) listModel.getElementAt(index);
                try {
                    int respuesta = JOptionPane.showConfirmDialog(SwingUtilities.getRoot((Component) e.getSource()),"¿Esta seguro que desa continuar?");
                    if (respuesta == JOptionPane.OK_OPTION){
                        empleadoDAO.borrarEmpleado(empSelected.getId());
                        refresh();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = lstEmpleados.getSelectedIndex();
                    Empleado empSelected = (Empleado) listModel.getElementAt(index);
                    RegistrarEditar registrarEditar = new RegistrarEditar(estaVentana);
                    registrarEditar.setTextoEditar(Integer.toString(empSelected.getId()),empSelected.getNombre(),Integer.toString(empSelected.getEdad()));
                    registrarEditar.ocultarBtnRegistrar();
                    registrarEditar.setTituloVentana("Editar Empleado");
                    registrarEditar.setLocationRelativeTo(SwingUtilities.getRoot((Component) e.getSource()));
                    registrarEditar.pack();
                    registrarEditar.setVisible(true);
                    refresh();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getPanel(){
        return panel1;
    }

    public void refresh() throws SQLException {
        empleadosList = empleadoDAO.devolverEmpleadosBBDD();
        listModel.clear();
        for (Empleado emp : empleadosList)
            listModel.addElement(emp);
    }
}
