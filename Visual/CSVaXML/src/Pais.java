import java.util.ArrayList;
import java.util.Objects;

public class Pais {
    String nombre;
    ArrayList<Airport> aeropuertos;
    ArrayList<Airlines> aerolineas;

    public Pais(String nombre){
        this.nombre = nombre;
        aerolineas = new ArrayList<>();
        aeropuertos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
