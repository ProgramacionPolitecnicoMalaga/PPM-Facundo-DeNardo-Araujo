import java.util.ArrayList;

public class Curso {
    private String id;
    private String nombre;
    private ArrayList<Asignatura> listaAsignaturas;
    private ArrayList<Alumno> alumnosMatriculadosEnElCurso;

    public Curso(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        listaAsignaturas = new ArrayList<Asignatura>();
        alumnosMatriculadosEnElCurso = new ArrayList<Alumno>();
    }


    public void añadirAsignatura(Asignatura asignatura){
        listaAsignaturas.add(asignatura);
    }

    public void matricularAlumnoEnCurso(Alumno alumno){
        alumnosMatriculadosEnElCurso.add(alumno);
    }

    public void mostrarAsignatuas(){
        System.out.println(listaAsignaturas);
    }

    public void mostrarAlumnos(){
        System.out.println(alumnosMatriculadosEnElCurso);
    }

    @Override
    public String toString() {
        return "Curso:" + id + "Nombre Curso: " + nombre;
    }

    public ArrayList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public ArrayList<Alumno> getAlumnosMatriculadosEnElCurso() {
        return alumnosMatriculadosEnElCurso;
    }

    public void setAlumnosMatriculadosEnElCurso(ArrayList<Alumno> alumnosMatriculadosEnElCurso) {
        this.alumnosMatriculadosEnElCurso = alumnosMatriculadosEnElCurso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
