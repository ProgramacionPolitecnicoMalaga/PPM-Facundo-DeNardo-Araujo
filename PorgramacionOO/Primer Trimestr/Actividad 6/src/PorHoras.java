public class PorHoras extends Empleados {
    final static private int PRECIO_POR_HORA = 9;
    int horasTrabajadas;
    int salario;

    public PorHoras(String nombre, String apellidos, String dni, int horasTrabajadas) {
        super(nombre, apellidos, dni);
        this.horasTrabajadas = horasTrabajadas;
        this.salario = horasTrabajadas * PRECIO_POR_HORA;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
