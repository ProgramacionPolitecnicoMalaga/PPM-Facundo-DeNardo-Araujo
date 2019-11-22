import java.util.Objects;

public class Palabra {
    String nombreDePalabra;
    int codigoPalabra;

    public Palabra(String nombreDePalabra, int codigoPalabra){
        this.nombreDePalabra = nombreDePalabra;
        this.codigoPalabra = codigoPalabra;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return nombreDePalabra.equals(((Palabra)obj).getNombreDePalabra());
    }



    @Override
    public String toString() {
        return "Palabra{" +
                "Palabra='" + nombreDePalabra + '\'' +
                '}';
    }

    public String getNombreDePalabra() {
        return nombreDePalabra;
    }

    public void setNombreDePalabra(String nombreDePalabra) {
        this.nombreDePalabra = nombreDePalabra;
    }

    public int getCodigoPalabra() {
        return codigoPalabra;
    }

    public void setCodigoPalabra(int codigoPalabra) {
        this.codigoPalabra = codigoPalabra;
    }
}
