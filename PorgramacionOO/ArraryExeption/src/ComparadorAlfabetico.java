import java.util.Comparator;

public class ComparadorAlfabetico implements Comparator<ClaseDePrueba> {

    @Override
    public int compare(ClaseDePrueba claseDePrueba, ClaseDePrueba t1) {
        return claseDePrueba.getCadena().compareTo(t1.getCadena());
    }
}
