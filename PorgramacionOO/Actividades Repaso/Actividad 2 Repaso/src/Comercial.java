import java.util.ArrayList;

public class Comercial {
    String nombre;
    ArrayList<Integer> ventas;

    public Comercial(String nombre){
        this.nombre = nombre;
        ventas = new ArrayList<>();
    }

    public void addVenta(int venta){
        ventas.add(venta);
    }

    public ArrayList<Integer> getVentas() {
        return ventas;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
