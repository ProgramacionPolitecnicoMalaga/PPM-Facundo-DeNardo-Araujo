package Modelo;

public class Credencial {
    String id;
    String nombre;
    String hash;
    String algoritmoUsado;
    String salt;
    boolean estadoCredencial;
    String passUsada;

    public Credencial(String id, String nombre, String hash, String algoritmoUsado, String salt){
        this.id = id;
        this.nombre = nombre;
        this.hash = hash;
        this.algoritmoUsado = algoritmoUsado;
        this.salt = salt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getAlgoritmoUsado() {
        return algoritmoUsado;
    }

    public void setAlgoritmoUsado(String algoritmoUsado) {
        this.algoritmoUsado = algoritmoUsado;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public boolean isEstadoCredencial() {
        return estadoCredencial;
    }

    public void setEstadoCredencial(boolean estadoCredencial) {
        this.estadoCredencial = estadoCredencial;
    }

    public String getPassUsada() {
        return passUsada;
    }

    public void setPassUsada(String passUsada) {
        this.passUsada = passUsada;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
