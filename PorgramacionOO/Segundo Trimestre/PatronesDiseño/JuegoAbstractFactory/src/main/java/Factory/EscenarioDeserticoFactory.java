package Factory;

import Jugadores.Jugador;
import Jugadores.Patton;
import Obstaculos.Obstaculo;
import Obstaculos.Tanques;
import Villanos.Rommel;
import Villanos.Villano;


public class EscenarioDeserticoFactory implements ElementosJuegoFactory{
    public Jugador crearJugador() {
        return new Patton();
    }

    public Villano crearVIllano() {
        return new Rommel();
    }

    public Obstaculo crearObstaculo() {
        return new Tanques();
    }
}
