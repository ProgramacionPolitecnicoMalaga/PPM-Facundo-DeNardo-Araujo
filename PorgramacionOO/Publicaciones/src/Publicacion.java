public abstract class Publicacion implements Prestable {
    private String codigo;
    private String titulo;
    private int año;
    boolean prestado;
    String estado;


    public Publicacion(String codigo, String titulo, int año){
    this.codigo = codigo;
    this.titulo = titulo;
    this.año = año;
    prestado = false;
    estado = "Esta Disponible";
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo +"\n"+ "Titulo: " + titulo +"\n" + "Año: " + año +"\n" + "Estado disponible: " + estado;
    }

    @Override
    public void prestar() {
       prestado = true;
       estado = "No esta disponible";
    }

    @Override
    public void devolver() {
        if (prestado == true) {
            prestado = false;
            estado = "Esta disponible";
        }
    }

    @Override
    public String estaPrestado() {
        return estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }


}
