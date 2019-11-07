public class Invitados implements Comparable<Invitados> {
    private String apellido;
    String edad;



    public Invitados(String nombre, String edad) {
        this.apellido = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Invitados{" +
                "apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


    @Override
    public int compareTo(Invitados o) {
        return 0;
    }
}
