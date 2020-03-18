package com.politecnicomalaga.Vista;

import com.politecnicomalaga.DAO.ItemDAO;
import com.politecnicomalaga.Modelo.Item;
import com.politecnicomalaga.Modelo.Temas;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Añadir extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtFecha;
    private JLabel lblFecha;
    private JTextField txtNombre;
    private JTextArea txtMensaje;
    private JLabel lblNombre;
    private JLabel lblTema;
    private JComboBox cmbTema;
    private VentanaPrincipal ventanaPadre;
    private ItemDAO itemDAO;
    private Item item;
    private Temas  temas = new Temas();

    public Añadir(VentanaPrincipal ventanaPadre) throws SQLException {
        rellenarComboboxTemas();
        itemDAO = new ItemDAO();
        this.ventanaPadre = ventanaPadre;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    onOK();
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
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void onOK() throws SQLException {
        String fecha = txtFecha.getText();
        String[] fechaDividida = fecha.split("-");
        String año = fechaDividida[0];
        String mes = fechaDividida[1];
        String dia = fechaDividida[2];
        item = new Item(txtNombre.getText(), LocalDate.of(Integer.parseInt(año),Integer.parseInt(mes),Integer.parseInt(dia)),txtMensaje.getText(), cmbTema.getSelectedItem().toString());
        itemDAO.addItemOnBBDD(txtNombre.getText(),txtFecha.getText(),txtMensaje.getText(), cmbTema.getSelectedItem().toString());
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public Item getItem() {
        return item;
    }

    public void rellenarComboboxTemas(){
        ArrayList<String> temasArray = temas.getTemas();
        for (int i = 0; i < temasArray.size(); i++)
            cmbTema.addItem(temasArray.get(i));
    }
}
