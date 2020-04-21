package com.politecnico;

import java.util.ArrayList;

public class PodaExtremos {

    public int podarMasProximo (int numero, ArrayList<Integer> lista){
        int diferencia=Integer.MAX_VALUE;
        int indice= 0;
        for (int i=0; i<lista.size(); i++){
            int diferenciaCalculada = Math.abs(lista.get(i) - numero);
            if (diferenciaCalculada < diferencia){
                diferencia = diferenciaCalculada;
                indice = i;
            }
        }
        return lista.remove(indice);
    }

    public Integer podarMasLejano(int numero, ArrayList<Integer> lista){
        int indice = 0;
        int diferencia = 0;
       for (int i = 0; i < lista.size(); i++){
           int diferenciaCalculada = Math.abs(lista.get(i) - numero);
           if (diferencia < diferenciaCalculada){
               diferencia = diferenciaCalculada;
               indice = i;
           }

       }
        return  lista.remove(indice);
    }

}
