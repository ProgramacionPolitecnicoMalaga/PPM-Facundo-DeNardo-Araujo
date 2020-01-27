public class Barco extends Vehiculo {
    String nombre;
    double eslora;
    double calado;
    double manga;

    public Barco(String fechaEntrada, String fechaFabricacion, String nBastidor, String nombre, double eslora, double calado, double manga) {
        super(fechaEntrada, fechaFabricacion, nBastidor);
        this.nombre = nombre;
        this.eslora = eslora;
        this.calado = calado;
        this.manga = manga;
    }
}
