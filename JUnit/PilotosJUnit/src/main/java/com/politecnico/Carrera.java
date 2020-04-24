package com.politecnico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Carrera {
    private LinkedList<Participante> pilotosEnCarrera;

    public Carrera(){
        pilotosEnCarrera = new LinkedList<>();
    }

    public boolean addParticipante(Participante participante){
        boolean isAñadido = false;
        if (!pilotosEnCarrera.contains(participante)) {
            pilotosEnCarrera.add(participante);
            isAñadido = true;
        }
        return isAñadido;
    }

    public List getListadoParticimpantes(){
        List<Participante> lista = null;
        if (!pilotosEnCarrera.isEmpty())
            lista = pilotosEnCarrera;
        return lista;
    }

    public int getTotalParticipantes(){
        return pilotosEnCarrera.size();
    }

    public LinkedList<Participante> cloneCarrera(){
        LinkedList copia = (LinkedList) pilotosEnCarrera.clone();
        return copia;
    }

    public boolean setPosicion(String nombreParticipante, int posicion){
        boolean resultado = false;
        for (int i = 0; i < pilotosEnCarrera.size(); i++){
            if (pilotosEnCarrera.get(i).getNombre().equals(nombreParticipante)){
                Participante pa = pilotosEnCarrera.remove(i);
                pilotosEnCarrera.add(posicion,pa);
                resultado = true;
            }
        }
        return resultado;
    }


    public Participante getParticipantePorPosicion(int posicion){
        return pilotosEnCarrera.get(posicion);
    }



}
