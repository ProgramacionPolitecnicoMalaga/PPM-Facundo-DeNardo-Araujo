public class Actividad {
    double numHoras;
    Proyecto Proyecto;
    String descripcion;

    public Actividad(double numHoras, Proyecto proyecto, String descripcion) {
        this.numHoras = numHoras;
        Proyecto = proyecto;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "numHoras=" + numHoras +
                ", Proyecto=" + Proyecto +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public Proyecto getProyecto() {
        return Proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        Proyecto = proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
