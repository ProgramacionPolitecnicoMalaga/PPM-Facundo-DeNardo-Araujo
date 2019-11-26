import java.util.Comparator;

public class Paciente {
    String nombre;
    int edad;
    String especialidad;
    int prioridad;

    public Paciente(String nombre, int edad, String especialidad, int prioridad) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.prioridad = prioridad;
    }

    public static final Comparator<Paciente> COMPARADOR_PRIORIDAD = new Comparator<Paciente>() {
        @Override
        public int compare(Paciente paciente, Paciente paciente1) {
            return paciente.getPrioridad() - paciente1.getPrioridad();
        }
    };

    @Override
    public String toString() {
        return "Paciente: " + nombre + " edad: " + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
