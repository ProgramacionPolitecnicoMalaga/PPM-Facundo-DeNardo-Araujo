package org.example.ServicioBuilder;

import org.example.Modelo.Servicio;

public class ServicioBuilder {
    private Servicio servicio;

    public ServicioBuilder(){
        servicio = new Servicio();
    }

    public ServicioBuilder setTipo(TiposServicio tipo){
        servicio.setTipo(tipo);
        return this;
    }

    public ServicioBuilder setDesayuno(){
        servicio.setDesayuno(true);
        return this;
    }

    public ServicioBuilder setAlmuerzo(){
        servicio.setAlmuerzo(true);
        return this;
    }

    public ServicioBuilder setCena(){
        servicio.setCena(true);
        return this;
    }

    public ServicioBuilder setHabitacion(String tipoHabitacion){
        servicio.setHabitacion(tipoHabitacion);
        return this;
    }

    public ServicioBuilder setCamaAdicional(){
        servicio.setCamaAdicional(true);
        return this;
    }

    public ServicioBuilder setParqueAtracciones(){
        servicio.setParqueDeAtracciones(true);
        return this;
    }

    public ServicioBuilder setCursoKite(){
        servicio.setCursoKiteSurf(true);
        return this;
    }

    public ServicioBuilder setActividadesInfantiles(){
        servicio.setActividadesInfantiles(true);
        return this;
    }

    public ServicioBuilder setCineEnPlaya(){
        servicio.setCineEnLaPlaya(true);
        return this;
    }

    public Servicio getResultado(){
        return servicio;
    }

}
