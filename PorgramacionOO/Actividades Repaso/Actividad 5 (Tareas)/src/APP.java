import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class APP {
    private JPanel panel1;
    private JButton PENDIENTESButton;
    private JButton HOYButton;
    private JButton NUEVAButton;
    private JList<Tarea> ListaTareas;
    private JButton COMPLETARButton;
    private JList<Categoria> ListaCategorias;
    private JButton button1;
    DefaultListModel listModel = new DefaultListModel();
    DefaultListModel listModel2 = new DefaultListModel();
    private GestorTareas gestorTareas = new GestorTareas();
    Categoria cat00 = new Categoria("TODAS");
    Categoria cat0 = new Categoria("Programacion");
    Categoria cat2 = new Categoria("Ocio");

    public APP() {
        ListaCategorias.setModel(listModel);
        ListaTareas.setModel(listModel2);
        gestorTareas.addCategoria(cat00);
        gestorTareas.addCategoria(cat0);
        gestorTareas.addCategoria(cat2);
        Tarea tarea1 = new Tarea("Terminar app de tareas 0", LocalDate.of(2020,01,28));
        Tarea tarea2 = new Tarea("Terminar app de tareas 1", LocalDate.of(2020,01,29));
        Tarea tarea3 = new Tarea("Terminar app de tareas 2 ", LocalDate.of(2020,01,15));
        tarea1.setCategoria(new Categoria("Programacion"));
        tarea2.setCategoria(new Categoria("Programacion"));
        gestorTareas.addTarea(tarea1);
        gestorTareas.addTarea(tarea2);
        gestorTareas.addTarea(tarea3);
        setLists();
        COMPLETARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void setLists(){
        ArrayList<Categoria> cats = gestorTareas.listaCategorias();
        for (Categoria categoria : cats)
            listModel.addElement(categoria);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("T0-D0");
        frame.setContentPane(new APP().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
