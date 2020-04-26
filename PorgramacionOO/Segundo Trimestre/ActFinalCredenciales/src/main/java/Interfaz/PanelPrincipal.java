package Interfaz;

import Controlador.ControladorCredencialesDAO;
import Modelo.Credencial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class PanelPrincipal {
    private JPanel pnlMain;
    private JList lstCredenciales;
    private JButton btnValidar;
    private JButton btnRegistrar;
    private JList lstNombres;
    private JButton btnBorrar;
    private PanelPrincipal estaVentana;
    DefaultListModel<Credencial> listModel = new DefaultListModel<>();
    DefaultListModel<Credencial> listModelNombres = new DefaultListModel<>();
    private ArrayList<Credencial> credencialArrayList = new ArrayList<>();
    private ControladorCredencialesDAO controladorCredencialesDAO = new ControladorCredencialesDAO();

    public PanelPrincipal() throws SQLException {
        estaVentana = this;
        lstCredenciales.setModel(listModel);
        lstNombres.setModel(listModelNombres);
        lstCredenciales.setCellRenderer(new CredencialesPanel());
        lstCredenciales.setFixedCellWidth(pnlMain.getWidth());
        controladorCredencialesDAO.mostrarNombresCredencialesRegistradas(listModelNombres);
        lstCredenciales.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Estiramos la celda a 1000 px de altura
                lstCredenciales.setFixedCellHeight(1000);
                // Asignamos el valor -1 para que se recalcule la altura
                lstCredenciales.setFixedCellHeight(-1);
            }
        });
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onRegistrar(e);
            }
        });
        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onValidar(e);
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                metodoBorrar();
            }
        });
    }

    private void onRegistrar(ActionEvent e) {
        RegVal regVal = null;
        try {
            regVal = new RegVal(estaVentana);
            regVal.hideValidar();
            regVal.setLocationRelativeTo(SwingUtilities.getRoot((Component) e.getSource()));
            regVal.pack();
            regVal.setVisible(true);
            controladorCredencialesDAO.mostrarNombresCredencialesRegistradas(listModelNombres);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void onValidar(ActionEvent e) {
        RegVal regVal = null;
        try {
            regVal = new RegVal(estaVentana);
            regVal.rellenarValidar(listModelNombres.getElementAt(lstNombres.getSelectedIndex()));
            regVal.setCredencial(listModelNombres.getElementAt(lstNombres.getSelectedIndex()));
            regVal.hideRegistrar();
            regVal.setLocationRelativeTo(SwingUtilities.getRoot((Component) e.getSource()));
            regVal.pack();
            regVal.setVisible(true);
            Credencial cred = regVal.getCredencial();
            controladorCredencialesDAO.mostrarCredencialesRegistradas(listModel,cred);
        } catch (ArrayIndexOutOfBoundsException | SQLException ex) {
            JOptionPane.showMessageDialog(null," Para validar debe seleccionar una credencial. La contraseña de ambas es: 1234 ", "Alerta!", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/main/resources/alerta.png"));

        }
    }

    private void metodoBorrar() {
        try {
            Icon icon = new ImageIcon("src/main/resources/basura.png");
            int respuesta = JOptionPane.showConfirmDialog(null, "Va a BORRAR, ¿Desea continuar?", "Confirmar borrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
            if (respuesta == JOptionPane.OK_OPTION){
                controladorCredencialesDAO.borrarCredencial(listModelNombres.getElementAt(lstNombres.getSelectedIndex()).getId());
                controladorCredencialesDAO.mostrarNombresCredencialesRegistradas(listModelNombres);
            }
        } catch (ArrayIndexOutOfBoundsException|SQLException e) {
            JOptionPane.showMessageDialog(null," Para borrar debe seleccionar una credencial.", "Alerta!", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/main/resources/alerta.png"));

        }
    }

    public Container getPanel(){
        return pnlMain;
    }


}