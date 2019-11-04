import javax.swing.*;
import java.awt.*;

public class Imagen extends javax.swing.JPanel {
    public Imagen(){
        this.setSize(100,100);
    }
    public void paint(Graphics grafico){
        Dimension height = getSize();
    }

    ImageIcon img = new ImageIcon(getClass().getResource("/Users/facundodenardo/Documents/Web/CLASE/Programacion_S11AW/JuegoMoneda/check.jpg"));
}
