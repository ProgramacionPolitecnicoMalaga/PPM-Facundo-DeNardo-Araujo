package org.example.Vista;

import org.example.Modelo.Persona;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class Tabla {
    private JTable tblPersona;
    private JPanel panel1;
    private JButton btnImprimir;
    private JButton btnBorrar;
    private JButton btnInsertar;
    List<Persona> personas;
    PersonaTableModel personaTableModel;

    public Tabla(List<Persona> listaPersonas){
        this.personas = listaPersonas;
        personaTableModel = new PersonaTableModel(personas);
        tblPersona.setModel(personaTableModel);


        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                personaTableModel.insertarPersona();
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                personaTableModel.removeRow(tblPersona.getSelectedRow());
            }
        });

        btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(listaPersonas);
            }
        });

        tblPersona.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE){
                    tblPersona.getCellEditor().stopCellEditing();
                    personaTableModel.removeRow(tblPersona.getSelectedRow());
                }
            }
        });
    }

    public JPanel getPanel(){
        return panel1;
    }

}
