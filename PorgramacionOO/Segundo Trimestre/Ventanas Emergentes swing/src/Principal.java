import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JPanel pnlPrincipal;
    private JTextField txtValor;
    private JButton btnOk;
    private JLabel lblTexto;
    private JButton btnQuijote;
    private Principal estaVentana;


    public Principal(){
        estaVentana = this;
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialogo dialogo = new Dialogo(estaVentana);
                dialogo.setLocationRelativeTo(SwingUtilities.getRoot((Component) e.getSource()));
                dialogo.pack();
                dialogo.setVisible(true);
            }
        });

        btnQuijote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int respuesta = JOptionPane.showConfirmDialog(SwingUtilities.getRoot((Component) e.getSource()),"¿Esta seguro que desa continuar?");
                if (respuesta == JOptionPane.OK_OPTION)
                    lblTexto.setText("En un lugar de la mancha...");
            }
        });
    }


    public JPanel getPanel(){
        return pnlPrincipal;
    }

    public void setLblTexto(String valor){
        lblTexto.setText(valor);
    }

    public String gettxtValor(){
        return txtValor.getText();
    }
}
