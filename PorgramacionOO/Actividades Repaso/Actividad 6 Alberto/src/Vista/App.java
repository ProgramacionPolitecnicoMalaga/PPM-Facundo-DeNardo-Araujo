package Vista;

import LogicaNegocio.GestorCompraVenta;
import Modelo.Cliente;
import Modelo.CuentaBancaria;
import Modelo.Vehiculo;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class App {
    private JPanel panel1;
    private JTabbedPane lbnCompraVenta;
    private JTextField txtMatricula;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtColor;
    private JTextField txtAño;
    private JComboBox cmbCombustion;
    private JRadioButton rbtMalo;
    private JRadioButton rbtRegular;
    private JRadioButton rbtBueno;
    private JTextField txtPrecioCompra;
    private JLabel lblMatricula;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblColor;
    private JLabel lblAño;
    private JLabel lblCombustion;
    private JLabel lblEstado;
    private JPanel pnlCoche;
    private JButton btnRegistrarCoche;
    private JTextField txtNif;
    private JLabel lblNif;
    private JTextField txtNombre;
    private JLabel lblNombre;
    private JLabel Apellidos;
    private JTextField txtApellidos;
    private JTextField txtCuenta;
    private JLabel lblCuenta;
    private JButton btnRegistrarCliente;
    private JPanel pnlCliente;
    private JPanel pnlVenta;
    private JComboBox cmbVntVehiculo;
    private JTextField txtMarcaVenta;
    private JTextField txtModeloVenta;
    private JTextField txtAñoVenta;
    private JComboBox cmbClientes;
    private JLabel lblNombreVenta;
    private JTextField txtNombreVenta;
    private JTextField txtApellidosVenta;
    private JLabel lblApellidosVenta;
    private JTextField txtPrecioVenta;
    private JButton btnVender;
    private JLabel lblPrecio;
    private JPanel pnlVentaCoche;
    private JPanel pnlClienteVenta;
    private JPanel pnlPrecioVenta;
    private JTextField txtBalance;
    private JLabel lblBalance;
    private JButton btnComprar;
    private GestorCompraVenta gstCV = new GestorCompraVenta();
    public String estadoCoche(){
        String estado = "NO COGE EL RADIO";
       if (rbtBueno.isSelected())
           estado = "Bueno";
        if (rbtMalo.isSelected())
            estado = "Malo";
        if (rbtRegular.isSelected())
            estado = "Regular";
        return estado;
    }

    public void cargarCmbCmbstn(){
        cmbCombustion.addItem("Gasolina");
        cmbCombustion.addItem("Diesel");
        cmbCombustion.addItem("Hibrido");
        cmbCombustion.addItem("Electrico");
    }

    public void setLimpioV(){
        txtMatricula.setText(null);
        txtAño.setText(null);
        txtMarca.setText(null);
        txtModelo.setText(null);
        txtColor.setText(null);

    }

    public void setLimpioC(){
        txtNif.setText(null);
        txtNombre.setText(null);
        txtApellidos.setText(null);
        txtCuenta.setText(null);
    }

    public void datosVehiculo(){
        String matricula = cmbVntVehiculo.getSelectedItem().toString();
        Vehiculo vehiculo = gstCV.buscarCoche(matricula);
        txtMarcaVenta.setText(vehiculo.getMarca());
        txtModeloVenta.setText(vehiculo.getModelo());
        txtAñoVenta.setText(Integer.toString(vehiculo.getAño()));
    }

    public void datosCliente(){
        String nif = cmbClientes.getSelectedItem().toString();
        Cliente cliente = gstCV.buscarCliente(nif);
        txtNombreVenta.setText(cliente.getNombre());
        txtApellidosVenta.setText(cliente.getApellidos());
        txtBalance.setText(Double.toString(gstCV.saldoCliente(nif)));
    }


    public App() {
        cargarCmbCmbstn();
        btnRegistrarCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gstCV.registrar(new Vehiculo(txtMatricula.getText(),txtModelo.getText(),txtMarca.getText(),txtColor.getText(),Integer.parseInt(txtAño.getText()),cmbCombustion.getSelectedItem().toString(),estadoCoche()));
                cmbVntVehiculo.addItem(txtMatricula.getText());
                setLimpioV();
            }
        });
        btnRegistrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gstCV.registrar(new Cliente(txtNombre.getText(),txtApellidos.getText(),txtNif.getText(),new CuentaBancaria(txtCuenta.getText())));
                cmbClientes.addItem(txtNif.getText());
                setLimpioC();
            }
        });
        btnVender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gstCV.Venta(cmbVntVehiculo.getSelectedItem().toString(),cmbClientes.getSelectedItem().toString(),Double.parseDouble(txtPrecioVenta.getText()));
                datosCliente();
            }
        });
        btnComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gstCV.Compra(cmbVntVehiculo.getSelectedItem().toString(),cmbClientes.getSelectedItem().toString(),Double.parseDouble(txtPrecioVenta.getText()));
                datosCliente();
            }
        });
        cmbVntVehiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datosVehiculo();
            }
        });
        cmbClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datosCliente();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Compra-Venta");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
