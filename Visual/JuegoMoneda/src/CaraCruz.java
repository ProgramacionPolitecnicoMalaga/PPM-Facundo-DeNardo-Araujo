import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CaraCruz {
    private JPanel panel1;
    private JButton TIRARButton;
    private JTextField textField1;
    private JButton TIRADA_INDIVIDUALButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton REINICIARButton;
    private JTextField textField5;
    private JTextField textField6;
    private JLabel Label_img;

    int numeroDeTiradas;
    int numCaras = 0;
    int porcentajeCaras;
    int numCruz = 0;
    int porcentajeCruz;
    int caraYCruz;
    Random r = new Random();
    private int contador = 0;


    public void FlipCoin(){
        caraYCruz = r.nextInt(2) + 1;
        if (caraYCruz == 1) {
            numCaras++;
            porcentajeCaras = (numCaras * 100) / numeroDeTiradas;
            Label_img.setIcon(new ImageIcon("check.jpg"));
        } else {
            numCruz++;
            porcentajeCruz = (numCruz * 100) / numeroDeTiradas;
            Label_img.setIcon(new ImageIcon("cross.jpg"));
        }
        textField5.setText(Integer.toString(porcentajeCaras));
        textField6.setText(Integer.toString(porcentajeCruz));
    }

    public CaraCruz() {
        TIRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws NumberFormatException {
                try {
                    TIRADA_INDIVIDUALButton.setEnabled(false);
                    numeroDeTiradas = (Integer.parseInt(textField1.getText()));
                    while (numeroDeTiradas != 0) {
                        FlipCoin();
                        textField2.setText(Integer.toString(numCaras));
                        textField3.setText(Integer.toString(numCruz));
                        numeroDeTiradas--;
                    }
                    if (numeroDeTiradas == 0) {
                        TIRARButton.setEnabled(false);
                    }
                    textField4.setText("0");
                }catch (NumberFormatException ignored){}
            }
        });

        TIRADA_INDIVIDUALButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws NumberFormatException{
                try{
                ++contador;
                numeroDeTiradas = (Integer.parseInt(textField1.getText()));
                FlipCoin();
                if (contador == numeroDeTiradas){
                    TIRADA_INDIVIDUALButton.setEnabled(false);
                        }
                    }catch (NumberFormatException ignored){}
                textField2.setText(Integer.toString(numCaras));
                textField3.setText(Integer.toString(numCruz));
                int a = numeroDeTiradas - numCruz - numCaras;
                textField4.setText(Integer.toString(a));
            }
        });


        REINICIARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label_img.setIcon(null);
                numCaras=0;
                numCruz=0;
                contador = 0;
                porcentajeCaras = 0;
                porcentajeCruz = 0;
                textField4.setText("0");
                textField2.setText(Integer.toString(numCaras));
                textField3.setText(Integer.toString(numCruz));
                textField1.setText("0");
                textField5.setText(Integer.toString(porcentajeCaras));
                textField6.setText(Integer.toString(porcentajeCruz));
                TIRARButton.setEnabled(true);
                TIRADA_INDIVIDUALButton.setEnabled(true);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cara o Cruz");
        frame.setContentPane(new CaraCruz().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
