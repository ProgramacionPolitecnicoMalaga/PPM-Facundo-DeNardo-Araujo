import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathEvaluator;

public class Aeropuerto {
    String area;
    String matricula;
    Double lat;
    Double lon;
    String nombreCorto;
    String nombreLargo;
    String pais;

    public Aeropuerto(String area, String matricula, Double lat, Double lon, String nombreCorto,String nombreLargo, String pais) {
        this.area = area;
        this.matricula = matricula;
        this.lat = lat;
        this.lon = lon;
        this.nombreCorto = nombreCorto;
        this.nombreLargo = nombreLargo;
        this.pais = pais;
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

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
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

