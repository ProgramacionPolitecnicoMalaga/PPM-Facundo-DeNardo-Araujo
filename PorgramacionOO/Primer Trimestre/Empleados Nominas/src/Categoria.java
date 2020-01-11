public class Categoria {
    String nombreCategoria;
    int sueldo;

    public Categoria(String nombreCategoria, int sueldo) {
        this.nombreCategoria = nombreCategoria;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombreCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
