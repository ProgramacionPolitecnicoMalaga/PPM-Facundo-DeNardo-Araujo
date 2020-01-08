public class Issue {
    String nombreIncidencia;
    int idIncidencia;
    String sisteamAfectado;
    String Descripccion;

    public Issue(int idIncidencia, String sisteamAfectado, String descripccion) {
        this.idIncidencia = idIncidencia;
        this.sisteamAfectado = sisteamAfectado;
        Descripccion = descripccion;
    }



    @Override
    public boolean equals(Object obj) {
        return nombreIncidencia.equals(((Issue)obj).getNombreIncidencia());
    }

    @Override
    public int hashCode() {
        return idIncidencia;
    }

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public String getSisteamAfectado() {
        return sisteamAfectado;
    }

    public void setSisteamAfectado(String sisteamAfectado) {
        this.sisteamAfectado = sisteamAfectado;
    }

    public String getDescripccion() {
        return Descripccion;
    }

    public void setDescripccion(String descripccion) {
        Descripccion = descripccion;
    }

    public String getNombreIncidencia() {
        return nombreIncidencia;
    }

    public void setNombreIncidencia(String nombreIncidencia) {
        this.nombreIncidencia = nombreIncidencia;
    }


}
