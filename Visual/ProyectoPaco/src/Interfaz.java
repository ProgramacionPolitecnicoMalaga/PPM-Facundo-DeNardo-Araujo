import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    private JTextField primerNumero;
    private JButton SUMAR;
    private JTextField segundoNumero;
    private JTextField resultadoSuma;
    private JPanel Panel1;
    private JButton RESTAR;
    private JButton RESET;
    Float resultado;

    public Interfaz(){

        SUMAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            resultado = (Float.parseFloat(primerNumero.getText())) + Float.parseFloat(segundoNumero.getText());
            resultadoSuma.setText(String.valueOf(resultado));
            }
        });
        RESTAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado = (Float.parseFloat(primerNumero.getText())) - Float.parseFloat(segundoNumero.getText());
                resultadoSuma.setText(String.valueOf(resultado));
            }
        });
        RESET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNumero.setText("");
                segundoNumero.setText("");
                resultadoSuma.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfaz");
        frame.setContentPane(new Interfaz().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
}


