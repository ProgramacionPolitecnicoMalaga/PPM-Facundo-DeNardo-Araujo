import java.util.Iterator;
import java.util.PriorityQueue;

public class ProbandoPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Tarea> queue = new PriorityQueue<Tarea>(Tarea.COMPARADOR_PRIORIDAD);

        queue.add(new Tarea("B", 3));
        queue.add(new Tarea("F",2));
        queue.add(new Tarea("A", 1));
        queue.add(new Tarea("C", 2));
        queue.add(new Tarea("C", 5));
        queue.add(new Tarea("C", 4));

        System.out.println(queue);

        Iterator<Tarea> it = queue.iterator();
        while (queue.size()>0){
            System.out.println(queue.remove());
        }
           /* while (it.hasNext()){
                System.out.println(it.next());
            }*/
    }
}
