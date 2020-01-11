import java.util.ArrayList;

public class BaseDatosEmpleados {
    ArrayList<Empleado> BaseDatos;

    public BaseDatosEmpleados(){
        BaseDatos = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado){
        BaseDatos.add(empleado);
    }

    @Override
    public String toString() {
        return "BaseDatosEmpleados{" + BaseDatos +
                '}';
    }
}
