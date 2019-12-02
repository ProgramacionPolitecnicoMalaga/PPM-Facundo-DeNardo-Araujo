import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class RegistroEmpleados extends JFrame {
    private JButton REGISTRARButton;
    private JTextField nombreEmp;
    private JTextField apellidosEmp;
    private JTextField dniEmp;
    private JComboBox comboBox1;
    private JTextField sueldoEmpleado;
    private JPanel panel1;
    ArrayList<Categoria> lista = new ArrayList<>();
    ArrayList<Empleado> listaEmpleadosRegistrados = new ArrayList<>();



    public RegistroEmpleados() {
        cargarCategorias();
        añadirCategoriasACombo();
        REGISTRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            listaEmpleadosRegistrados.add(new Empleado(nombreEmp.getText(),apellidosEmp.getText(),dniEmp.getText(),comboBox1.getSelectedItem().toString(),Integer.parseInt(sueldoEmpleado.getText())));
                System.out.println(listaEmpleadosRegistrados);
                
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Categoria cat = (Categoria) comboBox1.getSelectedItem();
                sueldoEmpleado.setText(Integer.toString(cat.getSueldo()));
            }
        });
    }

    public ArrayList<Empleado> getListaEmpleadosRegistrados() {
        return listaEmpleadosRegistrados;
    }

    public void añadirCategoriasACombo(){
        Iterator<Categoria> it = lista.iterator();
        while (it.hasNext()){
            comboBox1.addItem(it.next());
        }
    }

    public void cargarCategorias(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("1.csv"));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split(";");
                lista.add(new Categoria(fields[0],Integer.parseInt(fields[1])));
                line = br.readLine();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void abrirVentana(){
        JFrame frame = new JFrame("Registrar Empleado");
        frame.setContentPane(new RegistroEmpleados().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
