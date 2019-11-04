public class Producto extends LoteDeProductos {
    private String nombre;
    private double precio;
    private double valoracion;

    public Producto(String nombre, double precio, double valoracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Producto: " + "\n" +
                "nombre: " + nombre + "\n" +
                "precio: " + precio + "\n" +
                "valoracion: " + valoracion
                ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
}
