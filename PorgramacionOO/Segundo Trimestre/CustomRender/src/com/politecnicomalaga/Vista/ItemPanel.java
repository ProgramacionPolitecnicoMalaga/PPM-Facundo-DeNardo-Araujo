package com.politecnicomalaga.Vista;

import com.politecnicomalaga.Modelo.Item;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ItemPanel extends JPanel implements ListCellRenderer<Item> {

    private JLabel lblAutor;
    private JLabel lblFecha;
    private JLabel lblTema;
    private JTextArea txtAreaTexto;
    public ItemPanel(){
        //setMinimumSize(new Dimension(100,100));
        setLayout(new BorderLayout(10,10));

        lblAutor = new JLabel();
        lblFecha = new JLabel();
        lblTema = new JLabel();
        txtAreaTexto = new JTextArea();
        txtAreaTexto.setWrapStyleWord(true);
        txtAreaTexto.setLineWrap(true);

        Border margenAutorFecha = new EmptyBorder(10,10,0,10);
        Border margenTexto = new EmptyBorder(0,10,20,10);
        lblAutor.setBorder(margenAutorFecha);
        lblFecha.setBorder(margenAutorFecha);
        lblTema.setBorder(margenAutorFecha);
        txtAreaTexto.setBorder(margenTexto);

        add(lblAutor, BorderLayout.WEST);
        add(lblFecha, BorderLayout.EAST);
        add(lblTema, BorderLayout.NORTH);
        add(txtAreaTexto, BorderLayout.SOUTH);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Item> jList, Item item, int i, boolean isSelected, boolean cellHasFocus) {

        lblAutor.setText(item.getAutor());
        lblFecha.setText(item.getFecha().toString());
        lblTema.setText(item.getTema());
        txtAreaTexto.setText(item.getTexto());
        txtAreaTexto.setSize(jList.getWidth(),Short.MAX_VALUE);

        if (isSelected){
            setBackground(Color.LIGHT_GRAY);
            colorTema(lblTema);
        } else {
            setBackground(Color.WHITE);
            lblTema.setBackground(Color.WHITE);
        }

        if (cellHasFocus){
            txtAreaTexto.setFont(new Font("SansSerif",Font.BOLD,14));
        } else {
            txtAreaTexto.setFont(new Font("SansSerif",Font.PLAIN,10));
        }

        return this;
    }

    public void colorTema(JLabel label){
        if (label.getText().equals("Mantenimiento")){
            lblTema.setBackground(Color.ORANGE);
            lblTema.setOpaque(true);
        }
        if (label.getText().equals("Desarrollo")){
            lblTema.setBackground(Color.BLUE);
            lblTema.setOpaque(true);
        }
        if (label.getText().equals("General")){
            lblTema.setBackground(Color.GRAY);
            lblTema.setOpaque(true);
        }
        if (label.getText().equals("IT")){
            lblTema.setBackground(Color.GREEN);
            lblTema.setOpaque(true);
        }
    }
}
