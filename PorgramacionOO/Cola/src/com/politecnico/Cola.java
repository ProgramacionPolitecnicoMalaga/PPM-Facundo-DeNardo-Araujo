package com.politecnico;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private int head;
    private int tail;
    private int elementos[];
    private int numeroElementosAlmacenados = 0;


    public  Cola(int tamanoCola){
        head = 0;
        tail = -1;
        elementos = new int[tamanoCola];
    }

    public int sacar(){
        int elemento;
        if (!estaVacia()){
            elemento = elementos[head];
            head++;
            if(head == elementos.length)
                head =0;
        }
        else
            elemento = intiger
        return -1;
    }

    public void meter(int nuevoElemento){
        elementos[0]= nuevoElemento;

    }
    public boolean estaVacia(){
        return (tail == -1);
        }

        public boolean estaLlena() {
        return (tail + 1) % elementos.length == head;
        }

        private int numeroElementos() {
        int temp = (tail - head) % elementos.length;
        if (temp < 0)
        }


    }

    public String toString(){
        String contenidoCola = "HEAD" + "(" + head + ")";
        int totalElementosRecorridos = 0;
        for (int i = head; totalElementosRecorridos < numeroElementos(); i%elementos.length){
            i = i % numeroElementos();
            contenidoCola += "|" + elementos[i] + "|";
            totalElementosRecorridos++;
        }
        contenidoCola += "TAIL(" + tail + ")";
        return contenidoCola;
    }
}
//problemas resolubles con estructuras mediante pilas.
