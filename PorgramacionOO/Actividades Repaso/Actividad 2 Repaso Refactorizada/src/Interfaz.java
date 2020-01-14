import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interfaz {
    Scanner sc;

    public Interfaz(){
        sc = new Scanner(System.in);
    }

    public int printMenuPrincipal(){
        System.out.println("1. Empleados que vendieron un número de items\n" +
                            "2. Obtener el promedio de ventas de cada uno\n" +
                            "3. Averiguar quién han conseguido el mayor número de ventas en un día\n" +
                            "4. Insertar un nuevo empleado y sus ventas\n" +
                            "5. Salir");
        return sc.nextInt();
    }

    public int empleadosItems(){
        System.out.println("Indique el numero de ventas buscado: ");
        int numero = sc.nextInt();
        return numero;
    }

    public void resultadosEmpItems(ArrayList<Comercial> ocurrencias, int ventas){
        System.out.println("Loes empleados con "+ ventas+ "  ventas son: ");
        for (Comercial comercial:ocurrencias)
            System.out.println(comercial);
    }

    public void promediosVenta(HashMap listaPromedios){
        listaPromedios.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

    public void comercialConMayorventa(Comercial comercial){
        System.out.println(
                "El comercial con mayor numero de ventas ha sido " + comercial + " con un total de " + comercial.obtenerVentaMaxima()
        );
    }

    public String registrarNombreEmpleado(){
        System.out.println("Indique el nombre del empleado");
        String nombre = sc.next();
        return nombre;
    }

    public void indicarVentas(){
        System.out.println("Indique las ventas de la semana del nuevo empleado");
    }
}
