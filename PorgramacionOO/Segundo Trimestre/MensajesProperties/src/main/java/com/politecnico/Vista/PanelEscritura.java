package com.politecnico.Vista;

import Dao.CredencialDAO;
import Modelo.Credencial;
import com.politecnico.Controlador.ControladorMensajes;
import com.politecnico.Controlador.ControladorUsuarios;
import com.politecnico.Modelo.LoggedUser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class PanelEscritura {
    private JPanel Panel1;
    private JPanel PanelEscritura;
    private JTextArea txtMensaje;
    private JButton btnEnviar;
    private JComboBox cmbDestinatario;
    private JTextField txtTitulo;
    private ControladorMensajes controladorMensajes = new ControladorMensajes();
    private CredencialDAO credencialDAO = new CredencialDAO();
    private LoggedUser loggedUser = LoggedUser.getInstance();

    public PanelEscritura() throws SQLException {
        rellenarCombo();
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int id = Integer.parseInt(loggedUser.credencial.getId());
                    int operacion = controladorMensajes.enviarMensaje(id,txtMensaje.getText(),obtenerIdDelDestinatario(),txtTitulo.getText());
                    txtMensaje.setText("");
                    txtTitulo.setText("");
                    if (operacion == 1){
                        JOptionPane.showMessageDialog(null,"El mensaje se ha enviado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/main/resources/valida.png"));
                    }else {
                        JOptionPane.showMessageDialog(null,"El envio del mensaje ha fallado", "Mensaje", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/main/resources/alerta.png"));
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }

    public JPanel getPanel(){
        return PanelEscritura;
    }

    public void rellenarCombo() throws SQLException {
        ArrayList<Credencial> creds = credencialDAO.devolverCredencialesBBDD();
        for (Credencial cred : creds)
            cmbDestinatario.addItem(cred);
    }

    public int obtenerIdDelDestinatario(){
         Credencial cred = (Credencial) cmbDestinatario.getSelectedItem();
         return Integer.parseInt(cred.getId());
    }
}
