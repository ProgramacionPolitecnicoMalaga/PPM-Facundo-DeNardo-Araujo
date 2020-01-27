import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarea {
    private Date fechaLimite;
    private String descripcion;
    private boolean completada;
    private Categoria categoria;

    public Tarea(String descripcion, Date fechaLimite){
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        completada = false;
        categoria = new Categoria("TODAS");
    }

    @Override
    public String toString() {
        return "FECHA: " + new SimpleDateFormat("dd-MM-yyyy").format(fechaLimite) + " | " + "DESCRIPCION: " + descripcion;
    }

    public void completarTarea(){
        completada = true;
    }

    public Date getFechaLimite() {
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
