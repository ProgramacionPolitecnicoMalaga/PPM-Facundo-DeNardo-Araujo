package org.example;

import org.example.Modelo.LoteProductos;
import org.example.Modelo.Producto;
import org.example.Selector.Selector;
import org.example.Selector.SelectorFactory;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        LoteProductos loteProductos = new LoteProductos();
        loteProductos.addProducto(new Producto(15,1));
        loteProductos.addProducto(new Producto(1,3));
        loteProductos.addProducto(new Producto(32,2));
        loteProductos.addProducto(new Producto(112,1));

        System.out.println("\n ¿ Que producto desea obtener ?");
        System.out.println("-------------------------------------");
        System.out.print( "1. Precio\n" +
                "2. Valoracion\n" +
                "3. Relacion Valoracion-Precio\n" +
                "Opción:");
        int opcion = sc.nextInt();
        System.out.println("------------------------------------");

        Selector selector = new Selector();
        selector.setFiltro(SelectorFactory.getFiltro(opcion));

        System.out.println(selector.getProducto(loteProductos));

    }
}
