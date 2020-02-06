package Modelo;

import java.util.Objects;

public class Vehiculo extends Object{
    private String matricula;
    private String modelo;
    private String marca;
    private String color;
    private int año;
    private String combustion;
    private String estado;
    private double pCompra;
    private double pVenta;

    public Vehiculo(String matricula, String modelo, String marca, String color, int año, String combustion, String estado) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.año = año;
        this.combustion = combustion;
        this.estado = estado;
        pCompra = 0;
        pVenta = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    public void setpVenta(double pVenta) {
        this.pVenta = pVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return matricula.equals(vehiculo.matricula);
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", año=" + año +
                ", combustion='" + combustion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
