public class Airport {
    private Pais pais;
    private String nombre;
    private String iata;
    private String ciudad;
    private String latitud;
    private String longitud;

    public Airport(Pais pais, String nombre, String iata, String ciudad, String latitud, String longitud) {
        this.pais = pais;
        this.nombre = nombre;
        this.iata = iata;
        this.ciudad = ciudad;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "pais='" + pais + '\'' +
                ", nombre='" + nombre + '\'' +
                ", iata='" + iata + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                '}' + "\n";
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
