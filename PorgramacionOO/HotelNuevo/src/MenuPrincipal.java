import java.util.Date;
import java.util.Scanner;

public class MenuPrincipal {
    Scanner sc = new Scanner(System.in);
    int opcionelegida;
    int numerohuesped = 0;
    Huesped[] basedatoshuespedes = new Huesped[10000];

    public int MenuPrincipal(){
        System.out.println("-------------------------------------\n" +
                           "Menu Principal de la recepcion, que desea hacer ? \n" +
                            "1)REGISTRAR HUESPED\n" +
                            "2)BUSCAR HABITACION LIBRE\n" +
                            "3)GENERAR FACTURA\n " +
                            "4)salir del programa");
        opcionelegida = sc.nextInt();
        return opcionelegida;
    }

    public Huesped registrarHuesped(String nombre, String apellidos, String dni, Date fechaDeEntrada){
        basedatoshuespedes[numerohuesped]  = new Huesped(nombre,apellidos,dni, fechaDeEntrada);
        return basedatoshuespedes[numerohuesped];
    }

}
