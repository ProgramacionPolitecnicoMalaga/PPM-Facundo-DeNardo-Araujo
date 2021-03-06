import com.politecnico.Vista.PanelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, IOException {
        //HE USADO PROPERTIES PARA RECORDAR EL USUARIO Y CONTRASEÑA
        JFrame frame = new JFrame("Mensajes");
        frame.setContentPane(new PanelPrincipal().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height - 300;
        int width = 1000;
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width,200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
