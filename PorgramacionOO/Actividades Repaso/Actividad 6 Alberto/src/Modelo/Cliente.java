package Modelo;

public class Cliente extends Object {
    private  String nombre;
    private String apellidos;
    private String nif;
    private CuentaBancaria cuenta;


    public Cliente(String nombre, String apellidos, String nif, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.cuenta = cuenta;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNif() {
        return nif;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "Modelo.Cliente{" +
                "NOMBRE='" + nombre + '\'' +
                ", APELLIDOS='" + apellidos + '\'' +
                ", NIF='" + nif + '\'' +
                '}';
    }
}
