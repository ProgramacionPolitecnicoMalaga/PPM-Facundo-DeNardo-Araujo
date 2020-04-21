package org.example.Modelo;

import org.example.ServicioBuilder.TiposServicio;

public class Servicio {
    private TiposServicio tipo = TiposServicio.BASICO;
    public static final String HABITACION_SIMPLE = "simple";
    public static final String HABITACION_DOBLE = "doble";
    public static final String HABITACION_SUITE = "suite";

    private boolean desayuno = false;
    private boolean almuerzo = false;
    private boolean cena = false;
    private String habitacion = Servicio.HABITACION_SIMPLE;
    private boolean camaAdicional = false;
    private boolean parqueDeAtracciones = false;
    private boolean cursoKiteSurf = false;
    private boolean actividadesInfantiles = false;
    private boolean cineEnLaPlaya = false;

    public void setTipo(TiposServicio tipo) {
        this.tipo = tipo;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    public void setAlmuerzo(boolean almuerzo) {
        this.almuerzo = almuerzo;
    }

    public void setCena(boolean cena) {
        this.cena = cena;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public void setCamaAdicional(boolean camaAdicional) {
        this.camaAdicional = camaAdicional;
    }

    public void setParqueDeAtracciones(boolean parqueDeAtracciones) {
        this.parqueDeAtracciones = parqueDeAtracciones;
    }

    public void setCursoKiteSurf(boolean cursoKiteSurf) {
        this.cursoKiteSurf = cursoKiteSurf;
    }

    public void setActividadesInfantiles(boolean actividadesInfantiles) {
        this.actividadesInfantiles = actividadesInfantiles;
    }

    public void setCineEnLaPlaya(boolean cineEnLaPlaya) {
        this.cineEnLaPlaya = cineEnLaPlaya;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "tipo=" + tipo +
                ", desayuno=" + desayuno +
                ", almuerzo=" + almuerzo +
                ", cena=" + cena +
                ", habitacion='" + habitacion + '\'' +
                ", camaAdicional=" + camaAdicional +
                ", parqueDeAtracciones=" + parqueDeAtracciones +
                ", cursoKiteSurf=" + cursoKiteSurf +
                ", actividadesInfantiles=" + actividadesInfantiles +
                ", cineEnLaPlaya=" + cineEnLaPlaya +
                '}';
    }
}
