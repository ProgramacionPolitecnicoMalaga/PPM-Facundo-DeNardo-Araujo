import java.util.Objects;

public class Ciudad {
    private String nombre;

    public Ciudad(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Ciudad otraCiudad = (Ciudad) obj;
        return nombre.equals(otraCiudad.getNombre());
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
