public class Airline {
    private Pais pais;
    private String id;
    private String nombre;
    private String iata;
    private String codigoLlamada;

    public Airline(String id, String nombre, String iata, String codigoLlamada, Pais pais) {
        this.pais = pais;
        this.id = id;
        this.nombre = nombre;
        this.iata = iata;
        this.codigoLlamada = codigoLlamada;
    }

    @Override
    public String toString() {
        return "Airline{" +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", iata='" + iata + '\'' +
                ", codigoLlamada='" + codigoLlamada + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIata() {
        return iata;
    }

    public String getCodigoLlamada() {
        return codigoLlamada;
    }

    public Pais getPais() {
        return pais;
    }
}
