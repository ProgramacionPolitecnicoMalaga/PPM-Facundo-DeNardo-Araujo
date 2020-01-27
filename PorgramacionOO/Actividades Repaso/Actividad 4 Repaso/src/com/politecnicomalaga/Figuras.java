package com.politecnicomalaga;

import com.politecnicomalaga.modelo.Circulo;
import com.politecnicomalaga.modelo.Cuadrado;
import com.politecnicomalaga.modelo.Figura;
import com.politecnicomalaga.modelo.Triangulo;
import com.politecnicomalaga.negocio.CalculadoraArea;

public class Figuras {
    static Figura[] figuras;
    public static void main(String[] args) {
        figuras = new Figura[3];

        Figura circulo = new Circulo("rojo");
        ((Circulo) circulo).setRadio(5);

        Figura triangulo = new Triangulo("azul");
        ((Triangulo) triangulo).setBase(2);
        ((Triangulo)triangulo).setAltura(3);

        Figura cuadrado = new Cuadrado("amarillo");
        ((Cuadrado)cuadrado).setLado(4);

        figuras[0] = circulo;
        figuras[1] = triangulo;
        figuras[2] = cuadrado;

        CalculadoraArea calculadoraArea = new CalculadoraArea();
        for (Figura figura : figuras)
            System.out.println(calculadoraArea.calcular(figura));
    }
}
