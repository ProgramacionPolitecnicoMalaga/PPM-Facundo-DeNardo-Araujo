import com.toedter.calendar.JCalendar;

import javax.swing.*;

public class CalcularFechas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfaz");
        frame.setContentPane(new CalcularFechas().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    private JCalendar JCalendar1;
}
