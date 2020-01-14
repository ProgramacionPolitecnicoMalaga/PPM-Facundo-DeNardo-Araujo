import java.util.ArrayList;

public class Comercial {
    String nombre;
    ArrayList<Integer> ventas;

    public Comercial(String nombre){
        this.nombre = nombre;
        ventas = new ArrayList<>();
    }

    public ArrayList<Integer> getVentas() {
        return ventas;
    }

    public void addVenta(int ventaDia){
        ventas.add(ventaDia);
    }

    public int obtenerVentaMaxima(){
        int mayorVenta = 0;
        for (Integer venta : ventas)
            if (venta > mayorVenta)
                mayorVenta = venta;
            return mayorVenta;
    }

    public boolean haVendido(int ventaBuscada){
        boolean haVendido = false;
        for (Integer venta: ventas)
            if (venta == ventaBuscada)
                haVendido = true;
            return haVendido;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
