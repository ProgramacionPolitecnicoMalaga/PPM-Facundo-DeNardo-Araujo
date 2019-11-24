import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class BusquedaCSV2 {
    private JPanel panel1;
    private JButton AÑADIRButton;
    private JComboBox<Producto> comboBox1;
    private JTextArea textArea1;
    private JTextField textField1;
    private JTextField textField2;
    ArrayList<Producto> lista = new ArrayList<>();

    public BusquedaCSV2() {
        GestorListaProductos("archivo.csv");
        añadirProductosACombobOX();
        textField2.setText("0.00");
        textField1.setText("1");
        AÑADIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = (Producto) comboBox1.getSelectedItem();
                int cantidad = Integer.parseInt(textField1.getText());
                double totalCantProd = cantidad * getValor(p.getPrecio());
                if (textField2.getText() == null){
                    double totalCompra = Double.parseDouble(textField2.getText()) + totalCantProd;
                    textField2.setText(Double.toString(totalCompra));
                }else {
                    double totalCompra = Double.parseDouble(textField2.getText()) + totalCantProd;
                    textField2.setText(Double.toString(totalCompra));
                }
                textArea1.append( p.toString() + " X " + cantidad + " = " + totalCantProd + "\n");
            }
        });
    }

    public void GestorListaProductos(String archivo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(";");
                lista.add(new Producto(fields[0],fields[1],fields[2],fields[3], fields[4]));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void añadirProductosACombobOX(){
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()){
            comboBox1.addItem(it.next());
        }
    }

    public double getValor(String texto){
        if(texto.contains(",")){
            return Double.parseDouble(texto.replace(",", ".").trim());
        }
        return Double.parseDouble(texto.trim());
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("BusquedaCSV2");
        frame.setContentPane(new BusquedaCSV2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
