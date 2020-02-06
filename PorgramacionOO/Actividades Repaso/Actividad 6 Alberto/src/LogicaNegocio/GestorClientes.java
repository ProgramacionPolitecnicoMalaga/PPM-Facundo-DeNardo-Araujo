package LogicaNegocio;

import Modelo.Cliente;
import Modelo.CuentaBancaria;

import java.util.ArrayList;

public class GestorClientes {
    private ArrayList<Cliente> listaClientes;


    public GestorClientes(){
        listaClientes = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public Cliente buscarCliente(String nif){
        Cliente clienteBuscado = null;
        for (Cliente cliente : listaClientes)
            if (cliente.getNif().equals(nif))
                 clienteBuscado = cliente;
            return clienteBuscado;
    }

    public void addSaldo(Cliente cliente, double saldo){
        CuentaBancaria cuenta = cliente.getCuenta();
        cuenta.addSaldo(saldo);
    }

    public void restSaldo(Cliente cliente, double saldo){
        CuentaBancaria cuenta = cliente.getCuenta();
        cuenta.descontarSaldo(saldo);
    }

    public double obtenerSaldoTotalCliente(String nif){
        Cliente clienteBuscado = buscarCliente(nif);
        CuentaBancaria cuentaBuscada = clienteBuscado.getCuenta();
        return cuentaBuscada.saldoTotal();
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
}
