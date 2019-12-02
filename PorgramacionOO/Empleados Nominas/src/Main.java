import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Facundo", "De Nardo", "Y1029209L", "Tecnico", 900);
        Proyecto pro1 = new Proyecto("Alphasec", "Seguridad", 2.5, "El primer proyecto de la empresa");
        Actividad act1 = new Actividad(15,pro1,"esta es la descripcion de la actividad");

        emp1.añadirActividadRealizada(act1);
        emp1.añadirActividadRealizada(act1);
        emp1.añadirActividadRealizada(act1);
        emp1.MostrarActividadesRealizadas();

        System.out.println(emp1.getProductividad());

        emp1.calcularProductividad();

        System.out.println(emp1.getProductividad());


    }
}
