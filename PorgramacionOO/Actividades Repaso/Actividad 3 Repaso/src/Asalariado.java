public class Asalariado extends Empleado{
    public static final int SUELDO_FIJO = 1000;
    Nomina nomina;

    public Asalariado(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    public static int getSueldoFijo() {
        return SUELDO_FIJO;
    }


    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "Por Horas: " + nombre + " " + apellido + " DNI: " + dni + "\n" +
                nomina + "\n";
    }
}
