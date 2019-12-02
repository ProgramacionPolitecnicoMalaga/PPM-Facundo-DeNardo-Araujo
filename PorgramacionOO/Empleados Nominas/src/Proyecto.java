public class Proyecto {
    String nombre;
    String departamento;
    double fprod;
    String descripcion;

    public Proyecto(String nombre, String departamento, double fprod, String descripcion) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.fprod = fprod;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", fprod=" + fprod +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getFprod() {
        return fprod;
    }

    public void setFprod(double fprod) {
        this.fprod = fprod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
