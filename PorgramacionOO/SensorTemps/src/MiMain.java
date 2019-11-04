import java.util.Scanner;

public class MiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        GeneradorDatosTemperatura generadorDatos = new GeneradorDatosTemperatura();
        boolean terminar = false;
        while (!terminar){
            System.out.println("Indica la hora: ");
            int hora = sc.nextInt();
            System.out.println("Indica la tempreratura: ");
            double temperatura = sc.nextInt();
            generadorDatos.setNuevaLecturaTemperatura(temperatura,hora);
        }
    }
}
