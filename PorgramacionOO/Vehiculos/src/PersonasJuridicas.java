public class PersonasJuridicas extends Compradores {
    String nombre;
    String cif;
    String razonSocial;

    public PersonasJuridicas(String nombre, String cif, String razonSocial) {
        this.nombre = nombre;
        this.cif = cif;
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
