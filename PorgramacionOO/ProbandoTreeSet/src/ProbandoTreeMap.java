import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class ProbandoTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Tarea> mapa = new TreeMap<String, Tarea>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        mapa.put("S", new Tarea("S", 1));
        mapa.put("A", new Tarea("A", 2));
        mapa.put("B", new Tarea("B", 3));

        Iterator<String> it = mapa.keySet().iterator();
        while (it.hasNext()){
            System.out.println(mapa.get(it.next()));
        }
    }
}
