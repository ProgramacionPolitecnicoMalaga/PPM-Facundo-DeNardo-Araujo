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
    private JButton MOVERPILOTOButton;
    private JTextField textField1;
    private JTextField textField2;
    private JButton ELIMINARPILOTOButton;
    private JButton MOSTRARPOSICIONESButton;
    private JPanel jpanel2;
    public JTextArea textArea1;
    private JButton INICIARButton;
    ArrayList<Pilotos> lista = new ArrayList<>();


    public Visual() {
        MOSTRARPOSICIONESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        MOVERPILOTOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        INICIARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pilotos");
        frame.setContentPane(new Visual().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
