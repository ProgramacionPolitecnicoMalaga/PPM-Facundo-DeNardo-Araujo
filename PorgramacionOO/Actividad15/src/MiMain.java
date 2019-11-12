import java.util.Random;

public class MiMain {
    public static void main(String[] args) { //java util timer
        ListaPilotos listaPilotos = new ListaPilotos();
        listaPilotos.cargarLista();
        listaPilotos.mostrarLista();
        System.out.println("===================Hamilton adelanta 2 posiciones================================");
        listaPilotos.atrasarPilotoAleatorio();
        listaPilotos.mostrarLista();
        listaPilotos.runLap();

    }
}
