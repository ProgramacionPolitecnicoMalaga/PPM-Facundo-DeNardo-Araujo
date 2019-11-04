import java.util.Date;

public class Vehiculos {
    String fechaDeFabricacion;
    String fechaDeEntrada;
    int numeroDeBastidor;

    public Vehiculos(String fechaDeFabricacion, String fechaDeEntrada, int numeroDeBastidor) {
        this.fechaDeFabricacion = fechaDeFabricacion;
        this.fechaDeEntrada = fechaDeEntrada;
        this.numeroDeBastidor = numeroDeBastidor;
    }

    public String getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(String fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public String getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public void setFechaDeEntrada(String fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    public int getNumeroDeBastidor() {
        return numeroDeBastidor;
    }

    public void setNumeroDeBastidor(int numeroDeBastidor) {
        this.numeroDeBastidor = numeroDeBastidor;
    }
}
