package org.example.Vista;

import org.example.Modelo.Persona;


import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PersonaTableModel extends AbstractTableModel {
    private static final int NOMBRE = 0;
    private static final int APELLIDOS = 1;
    private static final int EDAD = 2;
    private List<Persona> personas;
    private String[] nombresColumnas = {"Nombre","Apellidos","Edad"};

    public PersonaTableModel(List<Persona> listas){
        this.personas = listas;
    }


    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return nombresColumnas.length;
    }

    @Override
    public String getColumnName(int columna) {
        return nombresColumnas[columna];
    }

    @Override
    public Class<?> getColumnClass(int i) {
        switch (i){
            case NOMBRE:
            case APELLIDOS:
                return String.class;
            case EDAD:
                return Integer.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        if ((fila > -1) && (fila < personas.size())){
            switch(columna){
                case NOMBRE:
                    return personas.get(fila).getNombre();
                case APELLIDOS:
                    return personas.get(fila).getApellidos();
                case EDAD:
                    return personas.get(fila).getEdad();
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        if ((i > -1) && (i < personas.size())){
            if (i1 == NOMBRE) personas.get(i).setNombre((String) o);
            else if (i1 == APELLIDOS) personas.get(i).setApellidos((String) o);
            else if (i1 == EDAD) personas.get(i).setEdad((Integer) o);
        }
        fireTableCellUpdated(i,i1);
    }


    public void insertarPersona(){
        personas.add(new Persona("","",0));
        fireTableDataChanged();
    }

    public void removeRow(int i){
        if ((i > -1) && (i < personas.size())){
            int confirmacionBorrar = JOptionPane.showConfirmDialog(null,"¿Borrar Persona?","Borrar",JOptionPane.WARNING_MESSAGE);
            if (confirmacionBorrar == JOptionPane.OK_OPTION) {
                personas.remove(i);
                fireTableRowsDeleted(i,i);
            }
        }
    }

}
