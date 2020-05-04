package com.politecnico;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class MultiplicacionTest extends TestCase {
    Multiplicacion multiplicacion;

    @Before
    public void setUp() throws Exception {
        multiplicacion = new Multiplicacion();
    }

    
    public void testMultiplicar() {
        try{
            multiplicacion.multiplicar(1000,2);
            fail("Expected ");
        }catch (IllegalArgumentException illegalArgumentException){
            assertEquals("X debe ser menor que 1000", illegalArgumentException.getMessage());

        }
    }
}