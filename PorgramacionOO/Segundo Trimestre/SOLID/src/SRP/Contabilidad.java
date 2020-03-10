package SRP;

import SRP.CalculadoraSueldo;

import java.util.ArrayList;

public class Contabilidad {
    private ArrayList<Empleado> empleados;

    public Contabilidad(){
        empleados = new ArrayList<>();
    }

    public double getSueldo(String nombreEmpleado){
        for (Empleado empleado: empleados){
            if (empleado.getNombre().equals(nombreEmpleado))
                return CalculadoraSueldo.CalcularSueldo(empleado);}
        return -1;
    }

    public void añadirEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
}
