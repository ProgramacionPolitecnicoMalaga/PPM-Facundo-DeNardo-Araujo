public class Main {
    public static void main(String[] args) {
        //CREO NUEVA LISTA DE CURSOS
        Cursos ListaDeCursos = new Cursos();

        // 1) INTRODUCIR NUEVO CURSO:
        Curso curso1 = new Curso("S11AW", "1º Desarrollo Aplicaciones Web");
        ListaDeCursos.addCurso(curso1);

        // 2) INTRODUCIR UNA NUEVA ASIGNATURA Y ASOCIARLA A UN CURSO
        Asignatura asignatura1 = new Asignatura("prog", "Programacion");
        curso1.añadirAsignatura(asignatura1);

        // 3) INTRODUCIR NUEVO ALUMNO Y ASOCIARLO A UN CURSO
        Alumno alumno1 = new Alumno("PEPE");
        Alumno alumno2 = new Alumno("JUAN");
        curso1.matricularAlumnoEnCurso(alumno1);
        curso1.matricularAlumnoEnCurso(alumno2);

        // 5) DEFINIR NUEVO INDICADOR PARA ASIGNATURA
        Indicador ind1 = new Indicador("Examen", "Examen Tema 1");
        asignatura1.añadirIndicador(ind1);

        // 4) MATRICULAR ALUMNO EN ASIGNATURA DE CURSO
        asignatura1.matricularAlumno(alumno1);
        asignatura1.matricularAlumno(alumno2);

        // 6) ASIGNAR UNA NOTA A UN INDICADOR DE UN ALUMNO
        asignatura1.añadirIndicardorDeUnAlumno(alumno1,ind1,9.5, "Examen casi perfecto");
        asignatura1.añadirIndicardorDeUnAlumno(alumno2,ind1,7.6, "Buen examen");

        // 7) OBTENER ASIGNATURAS DE UN CURSO
        curso1.mostrarAsignatuas();

        // 8) OBTENER ALUMNOS DE UNA ASIGNATURA
        asignatura1.mostrarAlumnosMatriculados();

        // 9) OBTENER NOTAS DE UN ALUMNO
        asignatura1.mostrarNotasAlumno(alumno1);
        asignatura1.mostrarNotasAlumno(alumno2);

        // 10) EXPORTAR/LEER CURSOS A/DESDE UN XML
        ListaDeCursos.GenerarXML();

        Cursos cursos2 = new Cursos();
        cursos2.LeerXML("cursosImportar.xml");
        System.out.println(cursos2.getListaDeCursos());

        System.out.println("-------------------------------");
        cursos2.getListaDeCursos().get(0).mostrarAsignatuas();
        System.out.println("-------------------------------");

        //EXPORTAR/LEER ALUMNOS DE UNA ASIGNATUAR A/DESDE XML
        asignatura1.GenerarXML();

        Asignatura asignatura2 = new Asignatura("prog2","Programacion2");
        asignatura2.LeerXML("asignaturaImportar.xml");
        asignatura2.mostrarIndAsign();
        asignatura2.mostrarAlumnosMatriculados();
        System.out.println("-------------------------------");
        asignatura2.mostrarNotasTodosAlumnos();



    }

}
