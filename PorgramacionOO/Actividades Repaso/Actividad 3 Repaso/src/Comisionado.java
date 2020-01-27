public class Comisionado extends Empleado {
    public static final int SUELDO_BASE = 900;
    public static final int PAGO_POR_VENTA = 50;
    public int nVentas;
    Nomina nomina;

    public Comisionado(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    public static int getSueldoBase() {
        return SUELDO_BASE;
    }

    public int getnVentas() {
        return nVentas;
    }

    public void setnVentas(int nVentas) {
        this.nVentas = nVentas;
    }


    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "Comisionado: " + nombre + " " + apellido + " DNI: " + dni + "\n" +
                "Sueldo Base: " + SUELDO_BASE + "\n" +
                "Ventas: " + nVentas + "\n" +
                nomina;
    }
}
