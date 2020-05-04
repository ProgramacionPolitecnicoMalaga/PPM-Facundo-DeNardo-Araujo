package org.example.Modelo;

import java.util.ArrayList;

public class LoteProductos {
    private ArrayList<Producto> productosEnElLote;

    public LoteProductos(){
        productosEnElLote = new ArrayList<>();
    }

    public int getTotalProductos(){
        return productosEnElLote.size();
    }

    public Producto getProductoEnPosicion(int posicion){
        return productosEnElLote.get(posicion);
    }

    public void addProducto(Producto producto){
        productosEnElLote.add(producto);
    }

    public ArrayList<Producto> getProductos(){
        return productosEnElLote;
    }
}
