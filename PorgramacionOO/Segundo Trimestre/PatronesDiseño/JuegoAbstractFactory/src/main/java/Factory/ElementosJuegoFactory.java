package Factory;

import Jugadores.Jugador;
import Obstaculos.Obstaculo;
import Villanos.Villano;

public interface ElementosJuegoFactory {
    public Jugador crearJugador();
    public Villano crearVIllano();
    public Obstaculo crearObstaculo();
}
