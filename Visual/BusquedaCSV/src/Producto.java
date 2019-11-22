import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;

public class Producto {
    int indice;
    String nombreProducto;
    String categoria;
    String cantidad;
    String precio;

    public Producto(int indice, String nombreProducto, String categoria, String cantidad, String precio) {
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

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
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
