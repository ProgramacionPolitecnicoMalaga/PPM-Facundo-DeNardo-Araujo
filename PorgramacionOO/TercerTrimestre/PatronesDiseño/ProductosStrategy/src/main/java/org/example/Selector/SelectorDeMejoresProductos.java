package org.example.Selector;

import org.example.Modelo.LoteProductos;
import org.example.Modelo.Producto;

public interface SelectorDeMejoresProductos {
    public final static int SELECTOR_PRECIO = 1;
    public final static int SELECTOR_VALORACION = 2;
    public final static int SELECTOR_PRECIO_VALORACION = 3;

    public Producto elegirMejorProducto(LoteProductos loteProductos);
}
