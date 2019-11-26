public class TipoDeUrgencia {
    String especialidad;
    int incidenciaDeGravedad;

    public TipoDeUrgencia(int incidenciaDeGravedad, String especialidad) {
        this.especialidad = especialidad;
        this.incidenciaDeGravedad = incidenciaDeGravedad;
    }

    @Override
    public String toString() {
        return especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getIncidenciaDeGravedad() {
        return incidenciaDeGravedad;
    }

    public void setIncidenciaDeGravedad(int incidenciaDeGravedad) {
        this.incidenciaDeGravedad = incidenciaDeGravedad;
    }


}
