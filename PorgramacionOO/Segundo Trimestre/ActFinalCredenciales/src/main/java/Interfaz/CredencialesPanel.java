package Interfaz;

import Modelo.Credencial;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CredencialesPanel extends JPanel implements ListCellRenderer<Credencial> {

    private JLabel lblNombre;
    private JLabel lblPass;
    private JLabel lblAlgoritmo;
    private JTextArea txtHash;
    public CredencialesPanel(){
        //setMinimumSize(new Dimension(100,100));
        setLayout(new BorderLayout(10,10));

        lblNombre = new JLabel();
        lblPass = new JLabel();
        lblAlgoritmo = new JLabel();
        txtHash = new JTextArea();
        txtHash.setWrapStyleWord(true);
        txtHash.setLineWrap(true);

        Border margenAutorFecha = new EmptyBorder(10,10,0,10);
        Border margenTexto = new EmptyBorder(0,10,20,10);
        lblNombre.setBorder(margenAutorFecha);
        lblPass.setBorder(margenAutorFecha);
        lblAlgoritmo.setBorder(margenAutorFecha);
        txtHash.setBorder(margenTexto);

        add(lblNombre, BorderLayout.WEST);
        add(lblPass, BorderLayout.EAST);
        add(lblAlgoritmo, BorderLayout.NORTH);
        add(txtHash, BorderLayout.SOUTH);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Credencial> jList, Credencial credencial, int i, boolean isSelected, boolean cellHasFocus) {

        lblNombre.setText( "Nombre: "+ credencial.getNombre());
        setPassOnPanel(credencial.getPassUsada(),credencial.isEstadoCredencial());
        lblAlgoritmo.setText("Algoritmo Usado: " + credencial.getAlgoritmoUsado());
        txtHash.setText("Hash: " + credencial.getHash());
        txtHash.setSize(jList.getWidth(),Short.MAX_VALUE);

        if (isSelected){
            setBackground(Color.LIGHT_GRAY);
        } else {
            setBackground(Color.WHITE);
            lblAlgoritmo.setBackground(Color.WHITE);
        }

        if (cellHasFocus){
            txtHash.setFont(new Font("SansSerif",Font.BOLD,11));
            lblNombre.setFont(new Font("SansSerif",Font.BOLD,11));
            lblAlgoritmo.setFont(new Font("SansSerif",Font.BOLD,11));
            lblPass.setFont(new Font("SansSerif",Font.BOLD,11));

        } else {
            txtHash.setFont(new Font("SansSerif",Font.PLAIN,10));
            lblNombre.setFont(new Font("SansSerif",Font.PLAIN,10));
            lblAlgoritmo.setFont(new Font("SansSerif",Font.PLAIN,10));
            lblPass.setFont(new Font("SansSerif",Font.PLAIN,10));
        }

        return this;
    }


    public void setPassOnPanel(String pass, boolean resultadoPass){
        lblPass.setText("Contraseña usada: " + pass);
        if (resultadoPass) {
            lblPass.setIcon(new ImageIcon("src/main/resources/valida.png"));
            lblAlgoritmo.setBackground(Color.GREEN);
            lblAlgoritmo.setOpaque(true);
        }
        else {
            lblPass.setIcon(new ImageIcon("src/main/resources/noVálida.png"));
            lblAlgoritmo.setBackground(Color.RED);
            lblAlgoritmo.setOpaque(true);
        }
    }
}
