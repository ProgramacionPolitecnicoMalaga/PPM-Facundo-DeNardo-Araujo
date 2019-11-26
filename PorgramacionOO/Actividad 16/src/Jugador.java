import javax.imageio.stream.ImageInputStream;
import java.util.LinkedList;
import java.util.Random;

public class Jugador implements JuegoOca {
    String color;
    String nombre;
    int casillaInicial;
    Random dado = new Random();
    LinkedList<Integer> historialCasillas = new LinkedList<>();//guardar una clase casilla en lugar de entero, es mejor para futuras ampliaciones
    LinkedList<Integer> RedoUndo = new LinkedList<>();


    public Jugador(String color, String nombre){
        this.color = color;
        this.nombre = nombre;
        casillaInicial = 0;
        historialCasillas.add(casillaInicial);
    }


    public void casillaActual(){
        System.out.println(historialCasillas.getLast());
    }

    public void avanzarCasilla(){
        int aCasilla = historialCasillas.getLast() + tirarDado();
        historialCasillas.add(aCasilla);
        casillaInicial = aCasilla;
    }

    public void retrosederCasilla(){
        int aCasilla = historialCasillas.getLast() - tirarDado();
        if (aCasilla <= 0){
            aCasilla = 0;
        }
        historialCasillas.add(aCasilla);
        casillaInicial = aCasilla;
    }

    public int tirarDado(){
        return dado.nextInt(6)+1;
    }


    @Override
    public void historial() {
        for (int i = 1 ;i < historialCasillas.size(); i++){
            if (historialCasillas.get(i) > historialCasillas.get(i - 1)){
                System.out.println( (i)+"." + " Avance a la casilla " + historialCasillas.get(i));
            }else  if (historialCasillas.get(i) < historialCasillas.get(i - 1)){
                System.out.println( (i)+"." + " Retroceso a la casilla " + historialCasillas.get(i));
            }
        }
    }

    @Override
    public void undo() {
        if (historialCasillas.size() > 1){
            int movimientoAdesHacer = historialCasillas.getLast();
            historialCasillas.removeLast();
            RedoUndo.add(movimientoAdesHacer);
        }else {
            System.out.println("Ya estas en la casilla 0, no se pueden deshacer movimientos");
        }
    }

    @Override
    public void redo() {
        if (RedoUndo.size() != 0) {
            int movimientoAreahcer = RedoUndo.getLast();
            RedoUndo.removeLast();
            historialCasillas.addLast(movimientoAreahcer);
        }else {
            System.out.println("Ya no puedes rehacer mas movimientos" + RedoUndo.size());
        }
    }
}
