import javax.swing.*;
import java.awt.event.*;

public class Dialogo extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtValor;
    private Principal ventanaPadre;

    public Dialogo(Principal principal) {
        this.ventanaPadre = principal;
        setContentPane(contentPane);
        setModal(true); //bloquea la ventana principal
        getRootPane().setDefaultButton(buttonOK);
        setTxtValor();

        /* JOptionPane.showconfirmationdialog(swignutilities.getroot((Component) actionevent.getsource) mmessage: ¿desea borrar?)   ventana para confirmar*/

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
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
    }

    private void onOK() {
        // add your code here
        ventanaPadre.setLblTexto(txtValor.getText());
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void setTxtValor(){
        txtValor.setText(ventanaPadre.gettxtValor());
    }
}
