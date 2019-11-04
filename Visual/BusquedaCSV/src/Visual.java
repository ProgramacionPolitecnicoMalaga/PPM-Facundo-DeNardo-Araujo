import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Visual {
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JTextArea textArea1;




    public static void main(String[] args){

        JFrame frame = new JFrame("Interfaz");
        frame.setContentPane(new Visual().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        String linea;
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.csv"));
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
