import java.util.Objects;

public class Indicador {
    private String tipo;
    private String nombre;
    private double nota;
    private String descripcion;

    public Indicador(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
        nota = 0.0;
        descripcion = " ";
    }

    @Override
    public String toString() {
        return "Indicador{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nota=" + nota +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Indicador indicador = (Indicador) o;
        return Double.compare(indicador.nota, nota) == 0 &&
                Objects.equals(tipo, indicador.tipo) &&
                Objects.equals(nombre, indicador.nombre) &&
                Objects.equals(descripcion, indicador.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, nombre, nota, descripcion);
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
