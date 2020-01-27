import javax.swing.*;

public class APP {
    private JPanel panel1;
    private JButton PENDIENTESButton;
    private JButton HOYButton;
    private JList list1;
    private JButton NUEVAButton;
    private JList list2;
    private JButton COMPLETARButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("T0D0");
        frame.setContentPane(new APP().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
