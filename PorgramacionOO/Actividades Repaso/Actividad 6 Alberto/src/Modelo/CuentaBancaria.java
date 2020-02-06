package Modelo;

public class CuentaBancaria {
    private String nCuenta;
    private double saldo;

    public CuentaBancaria(String nCuenta){
        this.nCuenta = nCuenta;
        saldo = 0;
    }

    public void addSaldo(double importe){
        this.saldo += importe;
    }

    public void descontarSaldo(double importe){
        this.saldo -= importe;
    }

    public double saldoTotal(){
        return saldo;
    }

    @Override
    public String toString() {
        return "Nº CUENTA: " + nCuenta;
    }
}
