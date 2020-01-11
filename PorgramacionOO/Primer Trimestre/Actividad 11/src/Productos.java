public class Productos extends LoteDeProductos {
    String nombre;
    double precio;
    int valoracion;

    public Productos(String nombre, double precio, int valoracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "----------------------------------" + "\n" +
                "Nombre prod. : " + nombre + "\n" +
                "Precio prod. : " + precio + "\n" +
                "Valoracion prod. : " + valoracion;
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

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
}
