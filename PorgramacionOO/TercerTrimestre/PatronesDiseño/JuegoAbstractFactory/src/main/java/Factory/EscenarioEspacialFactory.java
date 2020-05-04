package Factory;

import Jugadores.Jugador;
import Jugadores.USSEnterprise;
import Obstaculos.NavesKlingon;
import Obstaculos.Obstaculo;
import Villanos.Khan;
import Villanos.Villano;

public class EscenarioEspacialFactory implements ElementosJuegoFactory{
    public Jugador crearJugador() {
        return new USSEnterprise();
    }

    public Villano crearVIllano() {
        return new Khan();
    }

    public Obstaculo crearObstaculo() {
        return new NavesKlingon();
    }
}
