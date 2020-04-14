import Factory.ElementosJuegoFactory;
import Factory.EscenarioDeserticoFactory;
import Factory.EscenarioEspacialFactory;
import Factory.EscenarioSelvaFactory;
import Jugadores.Jugador;
import Obstaculos.Obstaculo;
import Villanos.Villano;

public class DemoJuego {
    public static ElementosJuegoFactory elementosJuegoFactory;
    public final static SelectorJuego selector = SelectorJuego.ESPACIO;

    public static void inicializar(){
        if (selector.equals(SelectorJuego.DESIERTO)){
            elementosJuegoFactory = new EscenarioDeserticoFactory();
        } else if (selector.equals(SelectorJuego.SELVA)){
            elementosJuegoFactory = new EscenarioSelvaFactory();
        } else if (selector.equals(SelectorJuego.ESPACIO)){
            elementosJuegoFactory = new EscenarioEspacialFactory();
        }
    }

    public static void main(String[] args) {
        inicializar();

        Jugador jugador = elementosJuegoFactory.crearJugador();
        Villano villano = elementosJuegoFactory.crearVIllano();
        Obstaculo obstaculo = elementosJuegoFactory.crearObstaculo();

        System.out.println("jugador: " + jugador.getNombreJugador() + "\n" +
                            "Villano: " + villano.getNombreVillano() + "\n" +
                            "Obstaculos: " + obstaculo.getNombreObstaculo());
    }
}
