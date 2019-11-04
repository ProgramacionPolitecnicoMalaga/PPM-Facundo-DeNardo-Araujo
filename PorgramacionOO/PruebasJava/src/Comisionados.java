import java.util.Scanner;

public class Comisionados extends Empleados {
     static final private int SALARIO_BASE = 800;
     static final private int COMISION_POR_VENTA = 50;
    int numeroDeVentas;
    int salarioTotal;



    public Comisionados( String nombre, String apellidos, String dni, int numeroDeVentas) {
        super(nombre, apellidos, dni);
        this.numeroDeVentas = numeroDeVentas;
        this.salarioTotal = SALARIO_BASE + (numeroDeVentas * COMISION_POR_VENTA);
    }

    public int getNumeroDeVentas() {
        return numeroDeVentas;
    }

    public void setNumeroDeVentas(int numeroDeVentas) {
        this.numeroDeVentas = numeroDeVentas;
    }

    public int getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(int salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
}
