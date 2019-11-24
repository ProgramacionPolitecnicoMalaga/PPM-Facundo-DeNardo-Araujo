import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Visual {
    private JPanel panel1;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton BUSCARButton;
    ArrayList<Producto> lista = new ArrayList<>();

    public Visual() {
        textField1.setText(null);
        GestorListaProductos("archivo.csv");
        BUSCARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarProductoBuscado();
            }
        });
    }

    public void GestorListaProductos(String archivo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(";");
                lista.add(new Producto(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],fields[4]));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mostrarBusqueda();
    }

    public void mostrarBusqueda(){
        textArea1.setText(null);
        String productoBuscado = textField1.getText();
        Iterator<Producto> it = lista.iterator();
            while (it.hasNext()){
                textArea1.append(it.next().toString() +"\n");
            }
    }

    public void mostrarProductoBuscado(){
        textArea1.setText(null);
        String productoABuscar = textField1.getText();
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.csv"));
            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(";");
                for (int i = 0; i < fields.length; i++){
                    if (fields[i].toLowerCase().contains(productoABuscar.toLowerCase())){
                        Producto prEnc = new Producto(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],fields[4]);
                        textArea1.append(prEnc.toString() + "\n");
                    }
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        JFrame frame = new JFrame("Interfaz");
        frame.setContentPane(new Visual().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
