package org.example.Selector;

import org.example.Modelo.LoteProductos;
import org.example.Modelo.Producto;

public class SelectorPrecio implements SelectorDeMejoresProductos {

    @Override
    public Producto elegirMejorProducto(LoteProductos loteProductos) {
        Producto productoMasBarato = new Producto(Integer.MIN_VALUE,0);
        for (Producto producto : loteProductos.getProductos())
            if (producto.getPrecio() > productoMasBarato.getPrecio())
                productoMasBarato = producto;
        return productoMasBarato;
    }
}
