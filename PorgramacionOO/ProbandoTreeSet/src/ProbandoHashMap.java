import java.util.HashMap;
import java.util.Iterator;

public class ProbandoHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Tarea> mapa = new HashMap<Integer, Tarea>();
        mapa.putIfAbsent(1, new Tarea("A",1)); //lo inserta solo si no existe.
        mapa.putIfAbsent(12, new Tarea("A",1)); // .put machaca si tiene el mismo hash
        mapa.putIfAbsent(10, new Tarea("B",2));

        System.out.println(mapa);
        Iterator<Integer> it = mapa.keySet().iterator();
        Iterator<Tarea> it2 = mapa.values().iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
