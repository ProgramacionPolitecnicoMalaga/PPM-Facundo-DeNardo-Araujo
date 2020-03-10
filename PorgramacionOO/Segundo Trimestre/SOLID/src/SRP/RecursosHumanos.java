package SRP;

import SRP.CalculadoraHoras;
import SRP.Empleado;

import java.util.ArrayList;

public class RecursosHumanos {
    private ArrayList<Empleado> empleados;

    public RecursosHumanos(){
        empleados = new ArrayList<>();
    }

    public double getHorasTrabajadas(String nombreEmpleado){
        for (Empleado empleado : empleados){
            if (empleado.getNombre().equals(nombreEmpleado))
                return CalculadoraHoras.calcularHoras(empleado);}
        return 0;
    }

    public void añadirEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
}
