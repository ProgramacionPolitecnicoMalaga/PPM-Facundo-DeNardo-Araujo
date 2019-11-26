import java.util.Comparator;
import java.util.Objects;

public class Tarea {
    private String descripcion;
    private int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }

    public static final Comparator<Tarea> COMPARADOR_PRIORIDAD = new Comparator<Tarea>() {
        @Override
        public int compare(Tarea tarea, Tarea tarea2) {
            return tarea.getPrioridad() - tarea2.getPrioridad();
        }
    };

    public static final Comparator<Tarea> COMPARADOR_DESCRIPCION = new Comparator<Tarea>() {
        @Override
        public int compare(Tarea tarea, Tarea tarea1) {
            return tarea.getDescripcion().compareTo(tarea1.getDescripcion());
        }
    };
}
