package Modelo;

import java.util.ArrayList;

public class Cuenta {
    ArrayList<Producto> productos;

    public Cuenta(){
        productos = new ArrayList<>();
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public double calcularTotalCuenta(){
        double total = 0.00;
        for (Producto producto : productos)
            total += producto.getPrecio();
        return total;
    }
}
