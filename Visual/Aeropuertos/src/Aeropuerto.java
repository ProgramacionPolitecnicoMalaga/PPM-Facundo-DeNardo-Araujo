import java.util.Objects;

public class Aeropuerto {
    String area;
    String matricula;
    String lat;
    String lon;
    String nombreCorto;
    String nombreLargo;
    String pais;

    public Aeropuerto(String area, String matricula, String lat, String lon, String nombreCorto, String nombreLargo, String pais) {
        this.area = area;
        this.matricula = matricula;
        this.lat = lat;
        this.lon = lon;
        this.nombreCorto = nombreCorto;
        this.nombreLargo = nombreLargo;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "area='" + area + '\'' +
                ", matricula='" + matricula + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", nombreCorto='" + nombreCorto + '\'' +
                ", nombreLargo='" + nombreLargo + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

