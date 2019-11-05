import java.util.Objects;

public class ClaseDePrueba implements Comparable{
    private int valor;
    private String cadena;

    public ClaseDePrueba(int valor, String cadena) {
        this.valor = valor;
        this.cadena = cadena;
    }

    @Override
    public boolean equals(Object o) {
        return ((ClaseDePrueba) o ).getCadena().equals(cadena);
    }

    @Override
    public String toString() {
        return "ClaseDePrueba{" +
                "valor=" + valor +
                ", cadena='" + cadena + '\'' +
                '}';
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public int compareTo(ClaseDePrueba claseDePrueba) {
        if (valor > claseDePrueba.getValor()) return 1;
        else if (valor == claseDePrueba.getValor()) return 0;
        else return -1;
    }

}
