package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Mesa {
    String numero;
    LinkedList<Cuenta> cuentas;
    boolean cerrada;

    public Mesa(String numero){
        cuentas = new LinkedList<>();
        cerrada = true;
        newCuenta(new Cuenta());
    }

    public boolean isCerrada() {
        return cerrada;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    public String getNumero() { return numero; }

    public void newCuenta(Cuenta cuenta){
        setCerrada(false);
        cuentas.add(cuenta);
    }

    public void addProductoACuenta(Producto producto){
        Cuenta cuenta = cuentas.peekLast();
        cuenta.addProducto(producto);
    }

    public double hacerRecuentoTotalMesa(){
        setCerrada(true);
        double totalMesa = 0.00;
        for (Cuenta cuenta : cuentas)
            totalMesa += cuenta.calcularTotalCuenta();
        return totalMesa;
    }

    public Cuenta cerrarCuentaActual(){
        Cuenta cuentaDevolver = cuentas.peekLast();
        cuentaDevolver.calcularTotalCuenta();
        return cuentaDevolver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesa mesa = (Mesa) o;
        return Objects.equals(numero, mesa.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

}
