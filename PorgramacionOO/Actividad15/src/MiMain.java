public class MiMain {
    public static void main(String[] args) {
        ListaPilotos listaPilotos = new ListaPilotos();
        listaPilotos.cargarLista();
        listaPilotos.mostrarLista();
        System.out.println("==========================================================================");
        listaPilotos.moverPiloto("Hamilton L.", 3);
        listaPilotos.mostrarLista();
        System.out.println("==============================");
        listaPilotos.descalificarPiloto("Albon A.");
        listaPilotos.descalificarPiloto("Grosjean R.");
        listaPilotos.mostrarLista();
    }
}
