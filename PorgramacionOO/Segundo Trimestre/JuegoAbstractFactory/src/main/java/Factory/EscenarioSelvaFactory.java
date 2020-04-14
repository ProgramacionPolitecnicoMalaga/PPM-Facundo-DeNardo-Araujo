package Factory;

import Jugadores.Indiana;
import Jugadores.Jugador;
import Obstaculos.CarceleroTurco;
import Obstaculos.Obstaculo;
import Villanos.Molaram;
import Villanos.Villano;

public class EscenarioSelvaFactory implements ElementosJuegoFactory{
    public Jugador crearJugador() {
        return new Indiana();
    }

    public Villano crearVIllano() {
        return new Molaram();
    }

    public Obstaculo crearObstaculo() {
        return new CarceleroTurco();
    }
}
