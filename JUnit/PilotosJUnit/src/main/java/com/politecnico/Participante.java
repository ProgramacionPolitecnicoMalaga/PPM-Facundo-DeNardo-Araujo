package com.politecnico;

import java.util.List;
import java.util.Objects;

public class Participante {
    private int numeroDorsal;
    private String nombre;

    public Participante(String nombre, int dorsal){
        this.nombre = nombre;
        this.numeroDorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "numeroDorsal=" + numeroDorsal +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return numeroDorsal == that.numeroDorsal;
    }


}
