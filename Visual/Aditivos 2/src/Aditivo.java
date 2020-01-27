public class Aditivo {
    String peligrosidad;
    String name;
    String comentario;

    public Aditivo(String peligrosidad, String nombre, String descripcion) {
        this.peligrosidad = peligrosidad;
        this.name = nombre;
        this.comentario = descripcion;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(String peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
