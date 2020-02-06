package LogicaNegocio;

import Modelo.Vehiculo;

import java.util.ArrayList;

public class GestorVehiculo {
    private ArrayList<Vehiculo> listaVehiculos;

    public GestorVehiculo(){
        listaVehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }

    public Vehiculo buscarVehiculo(String matricula){
        Vehiculo vehiculoBuscado = null;
        for (Vehiculo vehiculo : listaVehiculos)
            if (vehiculo.getMatricula().equals(matricula))
                vehiculoBuscado = vehiculo;
        return vehiculoBuscado;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void establecerPrecioCompra(Vehiculo vehiculo, double pCompra){
        vehiculo.setpCompra(pCompra);
    }

    public void establecerPrecioVenta(Vehiculo vehiculo, double pVenta){
        vehiculo.setpVenta(pVenta);
    }
}
