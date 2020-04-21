package com.politecnico;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PodaExtremosTest {
    PodaExtremos podaExtremos = new PodaExtremos();;
    ArrayList<Integer> lista = new ArrayList<>();;

    @Before
    public void setUp(){
        lista.add(1);
        lista.add(21);
        lista.add(55);
        lista.add(1);
        lista.add(5);
        lista.add(8);
        lista.add(13);
        lista.add(3);
        lista.add(2);
        lista.add(34);
    }

    @Test
    public void podarMasProximo() {
        int resultadoDeseado0 = 8;
        int resultadoObtenido0 = podaExtremos.podarMasProximo(9,lista);
        int resultadoDeseado1 = 55;
        int resultadoObtenido1 = podaExtremos.podarMasProximo(49,lista);
        assertEquals(resultadoDeseado0,resultadoObtenido0);
        assertEquals(resultadoDeseado1,resultadoObtenido1);
    }

    @Test
    public void podarMasLejano() {
        int resultadoDeseado2 = 55;
        int resultadoObtenido2 = podaExtremos.podarMasLejano(10,lista);
        int resultadoDeseado3 = 1;
        int resultadoObtenido3 = podaExtremos.podarMasLejano(30,lista);
        assertEquals(resultadoDeseado2,resultadoObtenido2);
        assertEquals(resultadoDeseado3,resultadoObtenido3);
    }

    @After
    public void tearDown(){
        lista.clear();
    }
}