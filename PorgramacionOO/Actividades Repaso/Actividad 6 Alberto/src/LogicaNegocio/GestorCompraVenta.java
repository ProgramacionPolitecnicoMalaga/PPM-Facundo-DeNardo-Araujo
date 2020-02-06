package LogicaNegocio;
import Modelo.Cliente;
import Modelo.Vehiculo;

import java.util.ArrayList;

public class GestorCompraVenta {
    private GestorVehiculo gestorVehiculo;
    private GestorClientes gestorClientes;

    public GestorCompraVenta(){
        gestorClientes = new GestorClientes();
        gestorVehiculo = new GestorVehiculo();
    }

    public void registrar(Object objeto){
        if (objeto instanceof Vehiculo)
            gestorVehiculo.registrarVehiculo((Vehiculo) objeto);
        else if (objeto instanceof Cliente)
                gestorClientes.registrarCliente((Cliente) objeto);
    }

    public ArrayList<Vehiculo> listaCoches(){
       return gestorVehiculo.getListaVehiculos();
    }

    public  ArrayList<Cliente> listaClientes(){
        return gestorClientes.getListaClientes();
    }

    public Vehiculo buscarCoche(String matricula){
        Vehiculo VBuscado = gestorVehiculo.buscarVehiculo(matricula);
        return VBuscado;
    }

    public Cliente buscarCliente(String nif){
        Cliente Cbuscado = gestorClientes.buscarCliente(nif);
        return Cbuscado;
    }

    public void Compra(String matricula, String nif, double pCompra){
        Vehiculo vehiculo = gestorVehiculo.buscarVehiculo(matricula);
        Cliente cliente = gestorClientes.buscarCliente(nif);
        gestorVehiculo.establecerPrecioCompra(vehiculo,pCompra);
        gestorClientes.addSaldo(cliente,pCompra);
    }

    public void Venta(String matricula, String nif, double pVenta){
        Vehiculo vehiculo = gestorVehiculo.buscarVehiculo(matricula);
        Cliente cliente = gestorClientes.buscarCliente(nif);
        gestorVehiculo.establecerPrecioVenta(vehiculo,pVenta);
        gestorClientes.restSaldo(cliente,pVenta);
    }

    public double saldoCliente(String nif){
        return gestorClientes.obtenerSaldoTotalCliente(nif);
    }
}
