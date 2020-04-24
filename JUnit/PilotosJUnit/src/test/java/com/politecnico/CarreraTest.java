package com.politecnico;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class CarreraTest {
    Carrera carrera = new Carrera();

    @Test
    public void addParticipante() {
        //3) Comprobacion_De_aÑADIR_4_Participantes_Diferentes
        assertTrue(carrera.addParticipante(new Participante("participante 1",1)));
        assertTrue(carrera.addParticipante(new Participante("participante 2",2)));
        assertTrue(carrera.addParticipante(new Participante("participante 3",3)));
        assertTrue(carrera.addParticipante(new Participante("participante 4",4)));

        //4) si se inserta un participante repetido addParticipante devuelve false y el numero de participantes sigue siendo 4
        //given
        int valorEsperado = 4;
        //when
        assertFalse(carrera.addParticipante(new Participante("participante 4",4)));
        //then
        assertEquals(carrera.getTotalParticipantes(),valorEsperado);
    }

    @Test
    public void getListadoParticimpantes() {
        //1)ComprobamosQue_La_ListaDe_Participantes_Es_Null_Antes_De_Empezar
        assertNull(carrera.getListadoParticimpantes());

        //2)Comprobamos_que_la_lista_no_es_Null_Luego_De_Añadir_Un_Participante
        carrera.addParticipante(new Participante("Participante 0",0));
        assertNotNull(carrera.getListadoParticimpantes());
    }

    @Test
    public void getTotalParticipantes() {
    }

    @Test
    public void cloneCarrera() {
        //6 EN EL ENUNCIADO PONE QUE AL CLONAR NO DEBERIAN SER IGUALES, PERO SI DEBERIAN SERLOS NO ? no se si te referias a que al clonar hagamos otro array por valor, y no una referencia al listado original por asi decirlo
        //given
        inicializarTestDeCloneCarrera();
        //when
        Object[] lista1 =  carrera.getListadoParticimpantes().toArray();
        Object[] lista2 =  carrera.cloneCarrera().toArray();
        //Then
        assertArrayEquals(lista1,lista2);
    }

    @Test
    public void setPosicion() {
        //5)
        //given
        Participante wick = inicializarTestDeSetPosicion();
        //when
        carrera.setPosicion(wick.getNombre(),0);
        //then
        assertEquals(wick,carrera.getParticipantePorPosicion(0));

        //7)
        //given
        Carrera carrera2 = new Carrera();
        carrera2.addParticipante(new Participante("participante 1",1));
        carrera2.addParticipante(new Participante("participante 2",2));
        carrera2.addParticipante(new Participante("participante 3",3));
        carrera2.addParticipante(new Participante("participante 4",4));
        Object[] lista1 =  carrera2.getListadoParticimpantes().toArray();
        //when
        carrera2.setPosicion("participante 1",3);
        carrera2.setPosicion("participante 2",1);
        Object[] lista2 =  carrera2.getListadoParticimpantes().toArray();
        //then
        assertNotSame(lista1,lista2);
    }

    @Test
    public void getParticipantePorPosicion() {
    }

    public Participante inicializarTestDeSetPosicion(){
        Participante wick = new Participante("Jhon Wick", 33);
        Participante participante2 = new Participante("No Jhon Wick", 23);
        carrera.addParticipante(participante2);
        carrera.addParticipante(wick);
        return wick;
    }


    public void inicializarTestDeCloneCarrera(){
        carrera.addParticipante(new Participante("asd",12));
        carrera.addParticipante(new Participante("asd",122));
    }


}