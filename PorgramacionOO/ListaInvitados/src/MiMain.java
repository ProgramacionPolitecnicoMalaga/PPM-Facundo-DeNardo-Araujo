import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class MiMain {
    public static void main(String[] args) {
        ArrayList<Invitados> lista = new ArrayList<>();
        Invitados invitadorComparador = new Invitados("comparador", "01-01-2003");
        Invitados invitado1 = new Invitados("invitado1","10/07/1992");
        Invitados invitado2 = new Invitados("invitado2", "21/09/1993");
        Invitados invitado3 = new Invitados("invitado3", "01-08-2003");

        lista.add(invitado1);
        lista.add(invitado2);
        lista.add(invitado3);

        Iterator<Invitados> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

            Date edad = new Date();
            System.out.println(edad.toString());
        }
    }
}
