import java.util.Date;

public class Barcos extends Vehiculos {
    String nombre;
    double eslora;
    int calado;
    double manga;

    public Barcos(String nombre, double eslora, int calado, double manga, String fechaDeFabricacion, String fechaDeEntrada, int numeroDeBastidor) {
        super(fechaDeFabricacion,fechaDeEntrada,numeroDeBastidor);
        this.nombre = nombre;
        this.eslora = eslora;
        this.calado = calado;
        this.manga = manga;
    }

    @Override
    public String toString() {
        return "BARCO " + "\n" +
                "Nombre: " + nombre + "\n" +
                "Eslora: " + eslora + "\n" +
                "Calado: " + calado + "\n" +
                "Manga: " + manga + "\n" +
                "Fecha De Fabricacion: " + fechaDeFabricacion + "\n" +
                "Fecha de Entrada: " + fechaDeEntrada + "\n" +
                "Numero de Bastidor: " + numeroDeBastidor + "\n" +
                "--------------------------------------------------------";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getCalado() {
        return calado;
    }

    public void setCalado(int calado) {
        this.calado = calado;
    }

    public double getManga() {
        return manga;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }
}
