import java.util.ArrayList;
import java.util.Iterator;

public class MiMain {
    public static void main(String[] args) {
        ArrayList<Invitados> lista  = new ArrayList<>();
        Invitados invitadorComparador = new Invitados("comparador", 17);
        Invitados invitado1 = new Invitados("invitado1", 20);
        Invitados invitado2 = new Invitados("invitado2", 21);
        Invitados invitado3 = new Invitados("invitado3", 17);

        lista.add(invitado1);
        lista.add(invitado2);
        lista.add(invitado3);

        Iterator<Invitados> it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
