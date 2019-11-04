public class Asalariados extends Empleados {
    static final private int SALARIO = 1000;


    public Asalariados(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
    }


    public static int getSalario() {
        return SALARIO;
    }
}
