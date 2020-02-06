import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Tarea {

    private String descripcion;
    private boolean completada;
    private Categoria categoria;
    private LocalDate fechaLimite;

    public Tarea(String descripcion, LocalDate fechaLimite){
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        completada = false;
        categoria = new Categoria("TODAS");
    }

    @Override
    public String toString() {
        return "FECHA: " + fechaLimite + " | " + "DESCRIPCION: " + descripcion;
    }

    public void completarTarea(){
        completada = true;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public boolean isCompletada() {
        return completada;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
