import java.util.Comparator;

public class CompararPilotos implements Comparator<Pilotos> {
    @Override
    public int compare(Pilotos o1, Pilotos o2) {
        if (o1.getNombre() == o2.getNombre()){
            return -1;
        }else if (o1.getNombre()==o2.getNombre()){
            return 0;
        }else
        return 1;
    }
}
