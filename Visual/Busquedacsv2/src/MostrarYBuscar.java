import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MostrarYBuscar {
    private JTextField textField1;
    private JButton buscarButton;
    private JPanel Panel1;
    private JTextArea MostrarCSV;
    String textoAComparar;

    public MostrarYBuscar() {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try(BufferedReader br = new BufferedReader(new FileReader("/Users/facundodenardo/Documents/Web/CLASE/Programacion_S11AW/FacundoDeNardo_Programacion/BusquedaCSV/archivo.csv"))) {
                    String linea = br.readLine();
                    while(linea != null){
                        MostrarCSV.append(linea + "\n");
                        linea = br.readLine();

                    }

                } catch (IOException w) {
                    w.printStackTrace();
                }
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MostrarYBuscar");
        frame.setContentPane(new MostrarYBuscar().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
}
