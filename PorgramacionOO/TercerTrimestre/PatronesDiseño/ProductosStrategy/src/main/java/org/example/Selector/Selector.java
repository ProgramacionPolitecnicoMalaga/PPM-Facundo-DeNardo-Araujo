package org.example.Selector;

import org.example.Modelo.LoteProductos;
import org.example.Modelo.Producto;

public class Selector {
    private SelectorDeMejoresProductos filtro;

    public void setFiltro(SelectorDeMejoresProductos filtro){
        this.filtro = filtro;
    }

    public Producto getProducto(LoteProductos loteProductos){
        return filtro.elegirMejorProducto(loteProductos);
    }
}
