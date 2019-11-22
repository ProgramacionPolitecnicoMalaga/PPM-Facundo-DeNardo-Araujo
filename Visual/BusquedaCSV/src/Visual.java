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
                mostrarBusqueda();
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
    }

    public void mostrarBusqueda(){
        textArea1.setText(null);
        String productoBuscado = textField1.getText();
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()){
            String nombreProd =  it.next().getNombreProducto().toLowerCase();
            String[] nombreArray = nombreProd.split("[ ,]+");
            if (nombreProd.contains(productoBuscado)){
                textArea1.append(it.next().toString() + "\n");
            }
            /*for (int i = 0; i < nombreArray.length; i++){
                if (nombreArray[i].equalsIgnoreCase(productoBuscado)){
                    textArea1.append(it.next().toString() + "\n");
                }
            }*/
        }
    }

    public void mostrarProductoBuscado(){
        for (int i = 0;i < lista.size(); i++ ) {
            textArea1.setText(lista.get(i).getNombreProducto());
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
