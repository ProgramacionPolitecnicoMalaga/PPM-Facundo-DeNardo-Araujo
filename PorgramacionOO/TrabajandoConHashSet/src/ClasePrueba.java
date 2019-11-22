import java.util.Objects;

public class ClasePrueba {
    private int numero;
    private String cadena;

    public ClasePrueba(int numero, String cadena){
        this.numero = numero;
        this.cadena = cadena;
    }

    @Override
    public String toString() {
        return "ClasePrueba{" +
                "numero=" + numero +
                ", cadena='" + cadena + '\'' +
                '}' + "\n";
    }

    @Override
    public int hashCode() {
        return numero; //asigna como has el propio atributo numero.
    }

    public String getCadena() {
        return cadena;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object obj) {
       //return numero == ((ClasePrueba)obj).getNumero();
         return cadena.equals(((ClasePrueba)obj).getCadena()) && numero == ((ClasePrueba)obj).getNumero();
    }
}
