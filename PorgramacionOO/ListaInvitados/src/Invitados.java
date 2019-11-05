import java.util.ArrayList;
import java.util.Comparator;

public class Invitados implements Comparable<Invitados> {
    private String apellido;
    private int edad;


    public Invitados(String nombre, int edad) {
        this.apellido = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Invitados{" +
                "apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public int compareTo(Invitados o) {
        return 0;
    }
}
