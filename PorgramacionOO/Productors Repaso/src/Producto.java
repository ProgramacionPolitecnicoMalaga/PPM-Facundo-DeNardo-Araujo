import java.util.ArrayList;
import java.util.HashMap;

public class Producto {
    String id;
    ArrayList<Componente> componentesNecesarios;

    public Producto(String id) {
        this.id = id;
        componentesNecesarios = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", componentesNecesarios=" + componentesNecesarios +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Componente> getComponentesNecesarios() {
        return componentesNecesarios;
    }

    public void setComponentesNecesarios(Componente especificacion) {
        componentesNecesarios.add(especificacion);
    }
}
