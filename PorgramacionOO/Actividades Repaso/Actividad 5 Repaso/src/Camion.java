public class Camion extends Vehiculo {
    String matricula;
    double ancho;
    double alto;
    double longitud;

    public Camion(String fechaEntrada, String fechaFabricacion, String nBastidor,String matricula, double ancho, double alto, double longitud) {
        super(fechaEntrada, fechaFabricacion, nBastidor);
        this.matricula = matricula;
        this.ancho = ancho;
        this.alto = alto;
        this.longitud = longitud;
    }
}