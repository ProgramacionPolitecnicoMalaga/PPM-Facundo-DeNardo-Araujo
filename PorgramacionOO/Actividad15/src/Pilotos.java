import java.util.ArrayList;

public class Pilotos implements Comparable<Pilotos>{

    String nombre;
    String escuderia;
    int posicionDeSalida;
    boolean descalificado;

    ArrayList<Pilotos> clasificacion = new ArrayList<>();

    public Pilotos(int posicionDeSalida, String nombre, String escuderia) {
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.posicionDeSalida = posicionDeSalida;
        this.descalificado = false;
    }

    public boolean equals(Object piloto){
        return ((Pilotos) piloto).getNombre().equals(nombre);
    }

    public void añadirPiloto(Pilotos piloto){
        clasificacion.add(piloto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDescalificado() {
        return descalificado;
    }

    public void setDescalificado() {
        this.descalificado = true;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public int getPosicionDeSalida() {
        return posicionDeSalida;
    }

    public void setPosicionDeSalida(int posicionDeSalida) {
        this.posicionDeSalida = posicionDeSalida;
    }

    @Override
    public String toString() {
        return "Pilotos{" +
                "nombre= '" + nombre + '\'' +
                ", escuderia= '" + escuderia + '\'' +
                ", posicionDeSalida= " + posicionDeSalida + "}";
    }


    @Override
    public int compareTo(Pilotos o) {
        if (o.getPosicionDeSalida() > posicionDeSalida){
            return -1;
        }else if (o.getPosicionDeSalida()> posicionDeSalida){
            return 0;
        }
        return 1;
    }
}
