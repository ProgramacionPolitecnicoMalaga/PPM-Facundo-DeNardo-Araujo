import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.*;

public class Invitados implements Comparable<Invitados> {
    private String apellido;
    Date fechaNacimiento;

    public Invitados(String nombre, Date fechaNacimiento) {
        this.apellido = nombre;
        this.fechaNacimiento = fechaNacimiento;

    }

    @Override
    public String toString() {
        return "Invitados{" +
                "apellido='" + apellido + '\'' +
                ", edad=" + fechaNacimiento +
                '}';
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public int compareTo(Invitados o) {
        return 0;
    }
}
