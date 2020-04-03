package Interfaz;

import Algoritmos.Algoritmo;
import Algoritmos.Sha3512;
import Controlador.ControladorAlgoritmo;
import Controlador.ControladorCredencialesDAO;
import Modelo.Credencial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class RegVal extends JDialog {
    private JPanel contentPane;
    private JButton btnOk;
    private JButton btnCancelar;
    private JTextField txtNombre;
    private JPasswordField txtPassword;
    private JComboBox cmbAlgoritmo;
    private JLabel lblAlgoritmo;
    private JButton btnValidar;
    private PanelPrincipal panelPrincipal;
    private ControladorAlgoritmo controladorAlgoritmo = new ControladorAlgoritmo();
    private ControladorCredencialesDAO controladorCredencialesDAO = new ControladorCredencialesDAO();
    private Credencial credencial;



    public RegVal(PanelPrincipal panelPadre) throws SQLException {
        this.panelPrincipal = panelPadre;
        rellenarCmbAlgoritmos();
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnOk);

        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    onOK();
                } catch (NoSuchAlgorithmException | SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
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
        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    onValidar();
                } catch (NoSuchAlgorithmException | SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private void onOK() throws NoSuchAlgorithmException, SQLException {
        String passPlana =String.valueOf(txtPassword.getPassword());
        String nombre = txtNombre.getText();
        String algDeseado = (String) cmbAlgoritmo.getSelectedItem();
        String salt = controladorAlgoritmo.generarSalt(algDeseado);
        String HashPass =  controladorAlgoritmo.getSaltedPassHash(algDeseado, passPlana, salt);
        controladorCredencialesDAO.registrarCredencial(nombre, HashPass, algDeseado, salt);
        dispose();
    }

    private void onValidar() throws SQLException, NoSuchAlgorithmException {
        String sal = credencial.getSalt();
        String hashBD = credencial.getHash();
        credencial.setEstadoCredencial(controladorAlgoritmo.comprobarPassword(credencial.getAlgoritmoUsado(),String.valueOf(txtPassword.getPassword()),hashBD,sal));
        credencial.setPassUsada(String.valueOf(txtPassword.getPassword()));
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void hideRegistrar(){
        cmbAlgoritmo.setVisible(false);
        lblAlgoritmo.setVisible(false);
        btnOk.setVisible(false);
    }

    public void hideValidar(){
        btnValidar.setVisible(false);
    }

    public void setCredencial(Credencial credencial){
      this.credencial = credencial;
    }

    public Credencial getCredencial(){
        return credencial;
    }


    public void rellenarValidar(Credencial cred){
        txtNombre.setText(cred.getNombre());
        txtNombre.setEditable(false);
    }


    public void rellenarCmbAlgoritmos(){
        cmbAlgoritmo.addItem("Bcrypt");
        cmbAlgoritmo.addItem("Sha3-512");
    }
}
