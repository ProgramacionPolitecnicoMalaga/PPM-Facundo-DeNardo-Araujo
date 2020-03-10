public class Vehiculo {
    String marca;
    String modelo;
    String km;
    String combustible;
    String precio;

    public Vehiculo(String marca, String modelo, String km, String combustible, String precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.combustible = combustible;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km='" + km + '\'' +
                ", combustible='" + combustible + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
