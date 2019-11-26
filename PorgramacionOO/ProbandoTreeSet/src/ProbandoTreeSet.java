import java.util.TreeSet;

public class ProbandoTreeSet {
    public static void main(String[] args) {
        TreeSet<Tarea> tareas = new TreeSet<>(Tarea.COMPARADOR_DESCRIPCION);

        tareas.add(new Tarea("B", 3));
        tareas.add(new Tarea("F",2));
        tareas.add(new Tarea("A", 1));
        tareas.add(new Tarea("C", 2));

        System.out.println(tareas);

        tareas.contains(new Tarea("B",-27));
    }
}
