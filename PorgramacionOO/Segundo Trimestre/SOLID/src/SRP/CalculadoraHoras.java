package SRP;

public class CalculadoraHoras {

    public static double calcularHoras(Empleado empleado){
        double horasTotales = 0;
        double[] horasPorJornada = empleado.getHorasTrabajadas();
        for (int i = 0; i < horasPorJornada.length; i++)
            horasTotales += horasPorJornada[i] + 0.5;
        return horasTotales;
    }

}
