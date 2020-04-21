package org.example.ServicioBuilder;

import org.example.Modelo.Servicio;

public class ServicioDirector {
    private ServicioBuilder servicioBuilder;

    public ServicioDirector(ServicioBuilder servicioBuilder){
        this.servicioBuilder = servicioBuilder;
    }

    public Servicio ofrecerServicioBascio(){
        servicioBuilder.setTipo(TiposServicio.BASICO);
        servicioBuilder.setHabitacion(Servicio.HABITACION_SIMPLE);
        servicioBuilder.setDesayuno();
        return servicioBuilder.getResultado();
    }

    public Servicio ofrecerPackRomance(){
        servicioBuilder.setTipo(TiposServicio.ROMANCE);
        servicioBuilder.setHabitacion(Servicio.HABITACION_DOBLE);
        servicioBuilder.setCena();
        return servicioBuilder.getResultado();
    }

    public Servicio ofrecerPackFamiliar(){
        servicioBuilder.setTipo(TiposServicio.FAMILIAR);
        servicioBuilder.setHabitacion(Servicio.HABITACION_DOBLE);
        servicioBuilder.setCamaAdicional();
        servicioBuilder.setDesayuno();
        servicioBuilder.setAlmuerzo();
        servicioBuilder.setCena();
        servicioBuilder.setParqueAtracciones();
        servicioBuilder.setActividadesInfantiles();
        servicioBuilder.setCineEnPlaya();
        return servicioBuilder.getResultado();
    }

    public Servicio ofrecerPackPadreRelajados(){
        servicioBuilder.setTipo(TiposServicio.PADRES_RELAJADOS);
        servicioBuilder.setHabitacion(Servicio.HABITACION_DOBLE);
        servicioBuilder.setCamaAdicional();
        servicioBuilder.setDesayuno();
        servicioBuilder.setAlmuerzo();
        servicioBuilder.setCena();
        servicioBuilder.setParqueAtracciones();
        servicioBuilder.setActividadesInfantiles();
        servicioBuilder.setCineEnPlaya();
        return servicioBuilder.getResultado();
    }

    public Servicio ofrecerPackDeluxe(){
        servicioBuilder.setTipo(TiposServicio.DELUXE);
        servicioBuilder.setHabitacion(Servicio.HABITACION_SUITE);
        servicioBuilder.setDesayuno();
        servicioBuilder.setAlmuerzo();
        servicioBuilder.setCena();
        servicioBuilder.setCursoKite();
        servicioBuilder.setCineEnPlaya();
        return servicioBuilder.getResultado();
    }

    public Servicio ofrecerPackDeluxeFamiliar(){
        servicioBuilder.setTipo(TiposServicio.DELUXE_FAMILIAR);
        servicioBuilder.setHabitacion(Servicio.HABITACION_SUITE);
        servicioBuilder.setCamaAdicional();
        servicioBuilder.setDesayuno();
        servicioBuilder.setAlmuerzo();
        servicioBuilder.setCena();
        servicioBuilder.setParqueAtracciones();
        servicioBuilder.setCursoKite();
        servicioBuilder.setActividadesInfantiles();
        servicioBuilder.setCineEnPlaya();
        return servicioBuilder.getResultado();
    }

}
