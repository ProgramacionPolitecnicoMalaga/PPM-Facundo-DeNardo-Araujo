package Modelo;

public class PoblacionPorNacionalidad {
    private String año;
    private String nacionalidad;
    private String numeroEmpadronados;

    public PoblacionPorNacionalidad(String año, String nacionalidad, String numeroEmpadronados){
        this.año = año;
        this.nacionalidad = nacionalidad;
        this.numeroEmpadronados = numeroEmpadronados;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNumeroEmpadronados() {
        return numeroEmpadronados;
    }

    public void setNumeroEmpadronados(String numeroEmpadronados) {
        this.numeroEmpadronados = numeroEmpadronados;
    }
}
