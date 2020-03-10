package SRP;

public class Empleado {
    public final static int SUELDO_POR_HORA = 20;
    private double[] horasTrabajadas;
    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
        horasTrabajadas = new double[25];
        for (int i = 0; i < horasTrabajadas.length; i++)
            horasTrabajadas[i] = 0;
    }

    public double calcularSueldo(){
        return calcularHoras() * SUELDO_POR_HORA;
    }

    public double calcularHoras(){
        double horasTotales = 0;
        for (int i = 0; i <horasTrabajadas.length; i++)
            horasTotales += horasTrabajadas[i];
        return horasTotales;
    }

    public String generarInforme(){
        String informe = "EMPLEADO: " + nombre + "\n";
        informe += "HORAS TRABAJADAS: " + calcularHoras() + "\n";
        informe += "SUELDO: " + calcularSueldo() + "\n";
        return informe;
    }

    public void setHorasTrabajadas(double horasTrabajadas ,int jornada){
        this.horasTrabajadas[jornada] = horasTrabajadas;
    }

    public static int getSueldoPorHora() {
        return SUELDO_POR_HORA;
    }

    public double[] getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double[] horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
