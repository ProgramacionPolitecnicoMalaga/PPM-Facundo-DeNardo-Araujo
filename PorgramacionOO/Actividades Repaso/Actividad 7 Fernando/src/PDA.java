import LogicaNegocio.Camarero;
import Modelo.Mesa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PDA {
    private JPanel panel1;
    private JRadioButton rbtMesa1;
    private JRadioButton rbtMesa2;
    private JRadioButton rbtMesa3;
    private JRadioButton rbtMesa4;
    private JRadioButton rbtMesa5;
    private JRadioButton rbtMesa6;
    private JRadioButton rbtMesa7;
    private JRadioButton rbtMesa8;
    private JRadioButton rbtMesa9;
    private JRadioButton rbtMesa10;
    private JPanel pnlMesas;
    private JLabel lblCuenta;
    private JLabel lblMesas;
    private JComboBox cmbProductos;
    private JButton btnAñadir;
    private JLabel lblProducto;
    private JList lstCuenta;
    private JTextField txtTotalCuenta;
    private JButton btnCobrarCuenta;
    private JPanel pnlCuenta;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnAgregar;
    private JButton btnTotalCaja;
    private JTextField textField3;
    private Camarero camarero = new Camarero();
    private Mesa mActual;

    public PDA() {
        rbtMesa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        rbtMesa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        rbtMesa3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        rbtMesa4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        rbtMesa5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        rbtMesa6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        rbtMesa7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        rbtMesa8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        rbtMesa9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        rbtMesa10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mActual = camarero.buscarMesa(selectedTable());
            }
        });
        btnCobrarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private String selectedTable(){
        String mesa = null;
        if (rbtMesa1.isSelected())
            mesa = "MESA 1";
        if (rbtMesa2.isSelected())
            mesa = "MESA 2";
        if (rbtMesa3.isSelected())
            mesa = "MESA 3";
        if (rbtMesa4.isSelected())
            mesa = "MESA 4";
        if (rbtMesa5.isSelected())
            mesa = "MESA 5";
        if (rbtMesa6.isSelected())
            mesa = "MESA 6";
        if (rbtMesa7.isSelected())
            mesa = "MESA 7";
        if (rbtMesa8.isSelected())
            mesa = "MESA 8";
        if (rbtMesa9.isSelected())
            mesa = "MESA 9";
        if (rbtMesa10.isSelected())
            mesa = "MESA 10";
        return mesa;
    }
    ButtonGroup bg = new ButtonGroup();
    public void addrbt(){
        bg.add(rbtMesa1);
        bg.add(rbtMesa2);
        bg.add(rbtMesa3);
        bg.add(rbtMesa4);
        bg.add(rbtMesa5);
        bg.add(rbtMesa6);
        bg.add(rbtMesa7);
        bg.add(rbtMesa8);
        bg.add(rbtMesa9);
        bg.add(rbtMesa10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PDA");
        frame.setContentPane(new PDA().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
