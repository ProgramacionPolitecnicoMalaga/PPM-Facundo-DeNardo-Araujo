import java.util.Comparator;

public class miComparador implements Comparator<ClaseDePrueba> {


    @Override
    public int compare(ClaseDePrueba claseDePrueba, ClaseDePrueba t1) {
         return claseDePrueba.compareTo(t1);
    }
}
