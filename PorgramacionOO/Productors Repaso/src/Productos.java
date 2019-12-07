import java.util.ArrayList;

public class Productos {
    ArrayList<Producto> lista;

    public Productos(){
        lista = new ArrayList<Producto>();
    }

    public void addProducto(Producto productoAAñadir){
        lista.add(productoAAñadir);
    }
}
