import java.util.HashSet;
import java.util.Iterator;

public class ProbandoHashSet {
    public static void main(String[] args) {
        HashSet<ClasePrueba> hashSet = new HashSet<>();

        hashSet.add(new ClasePrueba(1,"clase 1"));
        hashSet.add(new ClasePrueba(1,"clase 1"));
        hashSet.add(new ClasePrueba(2,"clase 1"));
        hashSet.add(new ClasePrueba(2,"clase 2"));
        hashSet.add(new ClasePrueba(1,"clase 2"));
        hashSet.add(new ClasePrueba(1,"clase 2"));
        hashSet.add(new ClasePrueba(3,"clase 3"));
       // System.out.println(hashSet);
        System.out.println(hashSet.contains(new ClasePrueba(345, "clase 1"))); //depende de lo que definamos qué es igual en equals.

        Iterator<ClasePrueba> it = hashSet.iterator();
        while (it.hasNext())
        System.out.println(it.next());
    }
}
