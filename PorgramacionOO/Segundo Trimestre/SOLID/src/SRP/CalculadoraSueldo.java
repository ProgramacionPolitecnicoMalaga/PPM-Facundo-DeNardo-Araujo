package SRP;

public class CalculadoraSueldo {

    public static double CalcularSueldo(Empleado empleado){
        double sueldo = 0;
        double[] horasPorJornada = empleado.getHorasTrabajadas();
        for (int i = 0; i < horasPorJornada.length; i++)
            sueldo += horasPorJornada[i] * empleado.SUELDO_POR_HORA;
        return sueldo;
    }
}
