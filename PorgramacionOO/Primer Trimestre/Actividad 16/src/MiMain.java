public class MiMain {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Rojo", "Facu");

        jugador1.avanzarCasilla();
        jugador1.avanzarCasilla();
        jugador1.avanzarCasilla();
        jugador1.avanzarCasilla();
        jugador1.historial();
        System.out.println("-------------------");
        jugador1.undo();
        jugador1.undo();
        jugador1.undo();
        jugador1.undo();
        jugador1.undo();
        jugador1.undo();
        jugador1.historial();
        System.out.println("-------------------");
        jugador1.redo();
        jugador1.redo();
        jugador1.redo();
        jugador1.redo();
        jugador1.redo();
        jugador1.redo();
        jugador1.historial();
    }
}
