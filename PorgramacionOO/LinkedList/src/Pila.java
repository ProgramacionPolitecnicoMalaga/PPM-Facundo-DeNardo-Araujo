import java.util.LinkedList;

public class Pila {
    LinkedList<Integer> pila;
    public Pila(){
        pila = new LinkedList<>();
    }

    public void añadirAlaPila(int numeroAñadir){
        pila.addFirst(numeroAñadir);
    }

    public void removerElemento(int numeroRemover){
        for (int i = 0; i < pila.size(); i++){
            if (pila.get(i) == numeroRemover){
                pila.remove(i);
            }
        }
    }

    public void removerElementodelaPila(){
    pila.removeLast();
    }

    public void mostrarHead(){
    pila.getFirst();
    }
}
