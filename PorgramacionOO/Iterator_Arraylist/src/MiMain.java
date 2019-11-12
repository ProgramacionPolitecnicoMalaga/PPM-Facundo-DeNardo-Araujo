import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

public class MiMain {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        ListIterator<Integer> it =  array.listIterator();
        if (it.hasNext()){
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.previous());
            System.out.println(it.previous());
            array.removeIf(n-> (n>3));
            System.out.println(array);

        }
    }
}
