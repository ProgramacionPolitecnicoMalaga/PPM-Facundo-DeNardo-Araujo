package org.example.Selector;

public class SelectorFactory {

    public static SelectorDeMejoresProductos getFiltro(int opcion){
        switch (opcion){
            case SelectorDeMejoresProductos.SELECTOR_PRECIO:
                return new SelectorPrecio();
            case SelectorDeMejoresProductos.SELECTOR_VALORACION:
                return new SelectorValoracion();
            default:
                return new SelectorPrecio();

        }
    }
}
