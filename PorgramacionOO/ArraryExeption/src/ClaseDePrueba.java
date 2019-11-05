import java.util.Objects;

public class ClaseDePrueba {
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
}
