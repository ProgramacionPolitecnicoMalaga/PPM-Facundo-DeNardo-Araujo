import javax.swing.*;

public class Aeropuertos {
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JPanel MainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aeropuertos");
        frame.setContentPane(new Aeropuertos().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
