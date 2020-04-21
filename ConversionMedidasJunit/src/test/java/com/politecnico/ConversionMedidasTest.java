package com.politecnico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class ConversionMedidasTest {

    ConversionMedidas conversionMedidas = new ConversionMedidas();;
  

    @Test
    public void inchACm() {
        Double resultadoCorrecto0 = 2.54;
        Double resultadoCorrecto1 = 30.48;
        Double resultadoObtenido0 = conversionMedidas.inchACm(1);
        Double resultadoObtenido1 = conversionMedidas.inchACm(12);
        Assert.assertEquals(resultadoCorrecto0,resultadoObtenido0);
        Assert.assertEquals(resultadoCorrecto1,resultadoObtenido1);
    }


    @Test
    public void cmAInch() {
        Double resultadoCorrecto2 = 4.72441;
        Double resultadoCorrecto3 = 0.0;
        Double resultadoCorrecto4 = 0.1968;
        Double resultadoObtenido2 = new BigDecimal(conversionMedidas.cmAInch(12)).setScale(5,RoundingMode.HALF_UP).doubleValue();
        Double resultadoObtenido3 = conversionMedidas.cmAInch(0);
        Double resultadoObtenido4 = new BigDecimal(conversionMedidas.cmAInch(0.5)).setScale(4,RoundingMode.DOWN).doubleValue();
        Assert.assertEquals(resultadoCorrecto2,resultadoObtenido2);
        Assert.assertEquals(resultadoCorrecto3,resultadoObtenido3);
        Assert.assertEquals(resultadoCorrecto4,resultadoObtenido4);
    }
}