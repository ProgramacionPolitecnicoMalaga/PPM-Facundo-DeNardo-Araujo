package com.politecnicomalaga.Vista;

import com.politecnicomalaga.DAO.EmpleadoDAO;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;

public class RegistrarEditar extends JDialog {
    private JPanel contentPane;
    private JButton btnRegistrar;
    private JButton buttonCancel;
    private JTextField txtNomApe;
    private JTextField txtEdad;
    private JButton btnEditar;
    private JLabel lblTitulo;
    private JLabel lblID;
    private JTextField txtID;
    private Principal ventanaPadre;
    private EmpleadoDAO empleadoDAO;

    public RegistrarEditar(Principal principal) throws SQLException {
        empleadoDAO = new EmpleadoDAO();
        this.ventanaPadre = principal;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnRegistrar);
        getRootPane().setDefaultButton(btnEditar);

        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtNomApe.getText();
                    String edad = txtEdad.getText();
                    empleadoDAO.registrarEmpleado(nombre,edad);
                    dispose();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    empleadoDAO.editarEmpleado(Integer.parseInt(txtID.getText()),txtNomApe.getText(),Integer.parseInt(txtEdad.getText()));
                    dispose();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void ocultarEditarOpt(){
        btnEditar.setVisible(false);
        lblID.setVisible(false);
        txtID.setVisible(false);
    }

    public void setTextoEditar(String id, String nombre, String edad){
        txtID.setText(id);
        txtNomApe.setText(nombre);
        txtEdad.setText(edad);
    }

    public void ocultarBtnRegistrar(){
        btnRegistrar.setVisible(false);
    }



    public void setTituloVentana(String titulo){
        lblTitulo.setText(titulo);
    }
}
