public class PorHoras extends Empleado {
    public final static int PRECIO_POR_HORA = 8;
    public int nHorasTrabajadas;
    Nomina nomina;

    public PorHoras(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    public static int getPrecioPorHora() {
        return PRECIO_POR_HORA;
    }

    public int getnHorasTrabajadas() {
        return nHorasTrabajadas;
    }

    public void setnHorasTrabajadas(int nHorasTrabajadas) {
        this.nHorasTrabajadas = nHorasTrabajadas;
    }


    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "Por Horas: " + nombre + " " + apellido + " DNI: " + dni + "\n" +
                "Precio/Hora: " + PRECIO_POR_HORA + "\n" +
                "Horas Trabajadas: " + nHorasTrabajadas + "\n" +
                nomina;
    }

}
