import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ActividadesEmpleados {
    private JList list1;
    private JList list2;
    private JButton CALCULARNOMINAButton;
    private JButton REGISTRAREMPLEADOButton;
    private JPanel panel1;
    private JButton AÑADIRACTIVIDADButton;
    public ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public ActividadesEmpleados() {
        REGISTRAREMPLEADOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroEmpleados ventana = new RegistroEmpleados();
                ventana.setVisible(true);
                ventana.abrirVentana();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Actividades");
        frame.setContentPane(new ActividadesEmpleados().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
