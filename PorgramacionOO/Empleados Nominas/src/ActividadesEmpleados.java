import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class ActividadesEmpleados {
    private JList list1;
    private JButton CALCULARNOMINAButton;
    private JButton REGISTRAREMPLEADOButton;
    private JPanel panel1;
    private JButton AÑADIRACTIVIDADButton;
    private JList listaEmpVisual;
    RegistroEmpleados registroEmpleados = new RegistroEmpleados();
    RegistroEmpleados ventana = new RegistroEmpleados();
    DefaultListModel<Empleado> listaModel = new DefaultListModel<>();
    ArrayList<Empleado> listaEmpleado = ventana.getListaEmpleadosRegistrados();

    public ActividadesEmpleados() {
        mostrarEmpleadosRegistrados();
        REGISTRAREMPLEADOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setVisible(true);
                ventana.abrirVentana();
            }
        });
    }

    public void mostrarEmpleadosRegistrados(){
        listaEmpVisual.setModel(listaModel);
        Iterator<Empleado> it = listaEmpleado.iterator();
        while (it.hasNext()){
            listaModel.addElement(it.next());
        }

        System.out.println(listaEmpleado);
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
