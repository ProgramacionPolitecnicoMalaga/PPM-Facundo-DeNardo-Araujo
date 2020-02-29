package LogicaNegocio;

import Modelo.Cuenta;
import Modelo.Mesa;
import Modelo.Producto;

import java.util.ArrayList;

public class Camarero {
    ArrayList<Mesa> mesasDelBar;

    public Camarero(){
        mesasDelBar = new ArrayList<>();
    }

    public void addproducto(String nMesa, Producto producto){
         Mesa mesa = buscarMesa(nMesa);
         if (mesa.isCerrada())
             mesa.newCuenta(new Cuenta());
         mesa.addProductoACuenta(producto);
    }

    public Mesa buscarMesa(String nMesa){
        Mesa mesaADevolver = null;
        for (Mesa mesa : mesasDelBar)
            if (mesa.getNumero().equals(nMesa))
                mesaADevolver =  mesa;
            else{
                mesaADevolver = new Mesa(nMesa);
                mesasDelBar.add(mesaADevolver);
            }
            mesaADevolver.setCerrada(false);
            return mesaADevolver;
    }

    public Cuenta cobrarMesa(String nMesa){
        Mesa mesa = buscarMesa(nMesa);
        Cuenta cuentaParaCobrar = mesa.cerrarCuentaActual();
        return cuentaParaCobrar;
    }

    public ArrayList<Mesa> mesasAbiertasOCerradas(String abiertaCerrada){
        ArrayList<Mesa> mesasAbiertas = new ArrayList<>();
        ArrayList<Mesa> mesasCerradas = new ArrayList<>();
        for (Mesa mesa : mesasDelBar)
            if (!mesa.isCerrada())
                mesasAbiertas.add(mesa);
            else mesasCerradas.add(mesa);
        if (abiertaCerrada.equals("Abierta"))
            return mesasAbiertas;
        else return mesasCerradas;
    }

}
