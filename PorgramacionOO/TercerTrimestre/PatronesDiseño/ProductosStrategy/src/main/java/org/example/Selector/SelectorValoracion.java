package org.example.Selector;

import org.example.Modelo.LoteProductos;
import org.example.Modelo.Producto;

public class SelectorValoracion implements SelectorDeMejoresProductos {

    @Override
    public Producto elegirMejorProducto(LoteProductos loteProductos) {
        Producto productoMejorValorado = new Producto(1,1);
        for (Producto producto : loteProductos.getProductos())
            if (producto.getValoracion() > productoMejorValorado.getValoracion())
                productoMejorValorado = producto;
        return productoMejorValorado;
    }
}
