import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Facundo", "De Nardo", "12345678L", "Tecnico", 900);
        Empleado emp2 = new Empleado("nombre2", "Apellidos2","dni2","Tecnico", 900);
        Proyecto pro1 = new Proyecto("Alphasec", "Seguridad", 2.5, "El primer proyecto de la empresa");
        Actividad act1 = new Actividad(15, pro1,"esta es la descripcion de la actividad");
        Actividad act2 = new Actividad(12, pro1,"esta es la descripcion de la segunda actividad");
        GeneradorDeXML gen1 = new GeneradorDeXML();
        ArrayList<Empleado> listaempleadosEmpresa = new ArrayList<>();

        listaempleadosEmpresa.add(emp1);
        listaempleadosEmpresa.add(emp2);

        emp1.añadirActividadRealizada(act1);
        emp1.añadirActividadRealizada(act2);
        emp1.añadirActividadRealizada(act1);

        emp2.añadirActividadRealizada(act2);
        emp2.añadirActividadRealizada(act1);
        emp2.añadirActividadRealizada(act2);

        emp1.MostrarActividadesRealizadas();
        emp2.MostrarActividadesRealizadas();

        System.out.println(emp1.getProductividad());
        System.out.println(emp2.getProductividad());

        emp1.calcularProductividad();
        emp2.calcularProductividad();

        System.out.println(emp1.getProductividad());
        System.out.println(emp2.getProductividad());

        System.out.println("======================");

        gen1.crearXMLActividadesEmpleado(emp1);
        gen1.crearXMLActividadesDeProyecto(pro1,listaempleadosEmpresa);
        gen1.crearXMLNominaEmpleado(listaempleadosEmpresa);



    }
}
