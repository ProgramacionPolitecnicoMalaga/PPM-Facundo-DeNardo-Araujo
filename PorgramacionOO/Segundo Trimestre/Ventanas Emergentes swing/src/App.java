import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialogos");
        frame.setContentPane(new Principal().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //con la libreria toolkit podemos definir el tamaño de la ventana.
    }
}
