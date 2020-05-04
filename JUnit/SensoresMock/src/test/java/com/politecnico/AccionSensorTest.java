package com.politecnico;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.intThat;
import static org.mockito.Mockito.mock;

import static org.mockito.Mockito.when;


public class AccionSensorTest extends TestCase {
    GrupoSensores sensoresNoIniciado;
    GrupoSensores sensoresVacios;
    GrupoSensores sensoresCasiVacios;
    GrupoSensores sensoresMitad;
    GrupoSensores sensoreaCasiLleno;
    GrupoSensores sensoresLlenos;
    MatrizSensores matrizSensores;
    AccionSensor accionSensor;

    @Before
    public void setUp(){
        sensoresNoIniciado = new GrupoSensores(Sensor.NO_INICIADO);
        sensoresVacios = new GrupoSensores(Sensor.ESTADO_VACIO);
        sensoresCasiVacios = new GrupoSensores(Sensor.ESTADO_CASI_VACIO);
        sensoresMitad = new GrupoSensores(Sensor.ESTADO_MITAD);
        sensoreaCasiLleno = new GrupoSensores(Sensor.ESTADO_CASI_LLENO);
        sensoresLlenos = new GrupoSensores(Sensor.ESTADO_LLENO);

        matrizSensores =  mock(MatrizSensores.class);
        accionSensor = new AccionSensor(matrizSensores);
        //When
        when(matrizSensores.getEstadoSensor(intThat(sensoresLlenos))).thenReturn(Sensor.ESTADO_LLENO);
        when(matrizSensores.getEstadoSensor(intThat(sensoreaCasiLleno))).thenReturn(Sensor.ESTADO_CASI_LLENO);
        when(matrizSensores.getEstadoSensor(intThat(sensoresMitad))).thenReturn(Sensor.ESTADO_MITAD);
        when(matrizSensores.getEstadoSensor(intThat(sensoresCasiVacios))).thenReturn(Sensor.ESTADO_CASI_VACIO);
        when(matrizSensores.getEstadoSensor(intThat(sensoresVacios))).thenReturn(Sensor.ESTADO_VACIO);
        when(matrizSensores.getEstadoSensor(intThat(sensoresNoIniciado))).thenThrow(IllegalStateException.class);
    }


    public void testSetNivelDemanda() {
    }


    public void testEvaluar(){
        //AccionesCorrectasParaLosSensoresEnDemandaBaja
        //Given
        accionSensor.setNivelDemanda(AccionSensor.DEMANDA_BAJA);
        

        //Then
        //Si getEstadoSensor genera una excepción, devuelve la acción ACCION_REVISION
        assertEquals(AccionSensor.ACCION_REVISION,accionSensor.evaluar(0));
        //Si getEstadoSensor devuelve ESTADO_VACIO devuelve la acción ACCION_REPOSICION
        assertEquals(AccionSensor.ACCION_REPOSICION,accionSensor.evaluar(10));
        //Si getEstadoSensor devuelve ESTAD_CASI_VACIO, devuelve la acción ACCION_REPOSICION
        assertEquals(AccionSensor.ACCION_REPOSICION,accionSensor.evaluar(21));
        //En cualquier otro caso, devuelve la acción ACCION_INNECESARIA
        assertEquals(AccionSensor.ACCION_INNECESARIA,accionSensor.evaluar(31));


        //AccionesCorrectasParaLosSensoresEnDemandaMedia
        //Given
        accionSensor.setNivelDemanda(AccionSensor.DEMANDA_MEDIA);

        //Then
        //Si getEstadoSensor genera una excepción, devuelve la acción ACCION_REVISION
        assertEquals(AccionSensor.ACCION_REVISION,accionSensor.evaluar(0));
        //Si getEstadoSensor devuelve ESTADO_VACIO devuelve la acción ACCION_REPOSICION
        assertEquals(AccionSensor.ACCION_REPOSICION,accionSensor.evaluar(10));
        //Si getEstadoSensor devuelve ESTAD_CASI_VACIO, devuelve la acción ACCION_REPOSICION
        assertEquals(AccionSensor.ACCION_REPOSICION,accionSensor.evaluar(21));
        //Si getEstadoSensor devuelve ESTADO_MEDIO, devuelve la acción ACCION_REPOSICION
        assertEquals(AccionSensor.ACCION_REPOSICION,accionSensor.evaluar(31));
        //En cualquier otro caso, devuelve la acción ACCION_INNECESARIA
        assertEquals(AccionSensor.ACCION_INNECESARIA,accionSensor.evaluar(41));

        //AccionesCoorectasParaLosSensoresEnDemandaAlta
        //Given
        accionSensor.setNivelDemanda(AccionSensor.DEMANDA_ALTA);

        //Then
        //Si getEstadoSensor genera una excepción, devuelve la acción ACCION_REVISION
        assertEquals(AccionSensor.ACCION_REVISION,accionSensor.evaluar(0));
        //Si getEstadoSensor devuelve ESTADO_VACIO devuelve la acción ACCION_REPOSICION
        assertEquals(AccionSensor.ACCION_REPOSICION,accionSensor.evaluar(10));
        //Si getEstadoSensor devuelve ESTAD_CASI_VACIO, devuelve la acción ACCION_REPOSICION
        assertEquals(AccionSensor.ACCION_REPOSICION,accionSensor.evaluar(21));
        //Si getEstadoSensor devuelve ESTADO_MEDIO, devuelve la acción ACCION_REPOSICION
        assertEquals(AccionSensor.ACCION_REPOSICION,accionSensor.evaluar(31));
        //En cualquier otro caso, devuelve la acción ACCION_INNECESARIA
        assertEquals(AccionSensor.ACCION_REPOSICION,accionSensor.evaluar(41));
        //En cualquier otro caso, devuelve la acción ACCION_INNECESARIA
        assertEquals(AccionSensor.ACCION_INNECESARIA,accionSensor.evaluar(51));
    }
}