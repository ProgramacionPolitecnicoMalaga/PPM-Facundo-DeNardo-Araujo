import java.util.Date;

public class Camiones extends Vehiculos{
    String matricula;
    double ancho;
    double altura;
    double longitud;

    public Camiones(String matricula, double ancho, double altura, double longitud, String fechaDeFabricacion, String fechaDeEntrada, int numeroDeBastidor) {
        super(fechaDeEntrada, fechaDeFabricacion, numeroDeBastidor);
        this.matricula = matricula;
        this.ancho = ancho;
        this.altura = altura;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "CAMION" +
                "Matricula: " + matricula + "\n" +
                "Ancho: " + ancho + "\n" +
                "Altura: " + altura + "\n" +
                "Longitud: " + longitud + "\n" +
                "Fecha De Fabricacion: " + fechaDeFabricacion + "\n" +
                "Fecha De Entrada: " + fechaDeEntrada + "\n" +
                "Numero De Bastidor: " + numeroDeBastidor + "\n" +
                "--------------------------------------------------------";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
