public class Producto {
    String indice;
    String nombreProducto;
    String categoria;
    String cantidad;
    String precio;

    public Producto(String indice, String nombreProducto, String categoria, String cantidad, String precio) {
        this.indice = indice;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  nombreProducto  + ", Categoria: " + categoria + ", Cantidad: " + cantidad + ", €: " + precio;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
