import java.util.ArrayList;

public class Comercial {
    String nombre;
    int[] ventas;

    public Comercial(String nombre){
        this.nombre = nombre;
        ventas = new int[5];
    }

    public void addVentas(int venta1, int venta2, int venta3, int venta4, int venta5){
        ventas = new int[]{venta1, venta2, venta3, venta4, venta5};
    }

    public boolean buscarVenta(int numeroBuscado){
        boolean encontrado = false;
        for (int i = 0; i < 5; i++)
           if (ventas[i] == numeroBuscado)
               encontrado = true;
           return encontrado;
    }

    public double calcularPromVentas(){
        double ventasTotales = 0.0;
        for (int i = 0; i < 5; i++)
            ventasTotales += ventas[i];
        return ventasTotales/5;
    }

    public int buscarVentaMasAlta(){
        int ventaMaxima = 0;
        for (int i = 0; i < 5 ; i++)
            if (ventas[i] > ventaMaxima)
                ventaMaxima = ventas[i];
            return ventaMaxima;
    }

    public int[] getVentas() {
        return ventas;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
