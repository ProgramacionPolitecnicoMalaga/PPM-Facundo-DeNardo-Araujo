import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ProbandoLinkedList {
    public static void main(String[] args) {
        /*
        PARA HACER INCERCIONES COMODAS AL PRINCIPIO O AL FINAL.
        add == addlast -> boolean
        addFirst
        addLast
        getFirst
        getLast
        removeFirst
        removeLast
        element : devuelve el primer elemento (nosuchelementexeption)
        peek - devuelve el primer elemento
        peekFirst todos los peek devuelven null en caso de estar vacios----- devuelve y no borra
        peekLast
        pollFirst tmb devuelven null si no hay nada == poll -> devuelve y borra
        pollLast
        indexOf
        contains

         */
        LinkedList<ElementoTest> llist = new LinkedList<>();
        Iterator<ElementoTest> it = llist.listIterator();
        llist.addFirst(new ElementoTest("primer Elemento",1));
        llist.addFirst(new ElementoTest("segundo Elemento",2));
        llist.addFirst(new ElementoTest("tercer Elemento",3));

        llist.addLast(new ElementoTest("cuarto Elemento", 4));
        llist.addLast(new ElementoTest("quinto Elemento", 5));
        System.out.println(llist);
        System.out.println(llist.getFirst());
        System.out.println(llist);
        System.out.println(llist.getLast());

        System.out.println(llist.removeFirst());
        System.out.println(llist);
        System.out.println(llist.removeLast());
        System.out.println(llist);

    }
}
