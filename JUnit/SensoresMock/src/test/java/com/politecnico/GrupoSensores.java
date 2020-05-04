package com.politecnico;

import org.mockito.ArgumentMatcher;

public class GrupoSensores implements ArgumentMatcher<Integer> {
    int inicio;
    int maximo;

    public GrupoSensores(int estado){
        switch (estado){
            case Sensor.NO_INICIADO:
                inicio = 0;
                maximo = 9;
                break;
            case Sensor.ESTADO_VACIO:
                inicio = 10;
                maximo = 19;
                break;
            case Sensor.ESTADO_CASI_VACIO:
                inicio = 20;
                maximo = 29;
                break;
            case Sensor.ESTADO_MITAD:
                inicio = 30;
                maximo = 39;
                break;
            case Sensor.ESTADO_CASI_LLENO:
                inicio = 40;
                maximo = 49;
                break;
            case Sensor.ESTADO_LLENO:
                inicio = 50;
                maximo = 59;
                break;
        }

    }

    @Override
    public boolean matches(Integer integer) {
        return (integer >= inicio) && (integer <= maximo);
    }
}
