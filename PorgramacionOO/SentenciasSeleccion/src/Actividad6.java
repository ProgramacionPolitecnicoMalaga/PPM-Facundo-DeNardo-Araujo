import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        int[] isabel = {7, 7, 10, 6, 4};
        int[] vicente = {4, 7, 5, 4, 5};
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero de items");
        int numerodeitems = sc.nextInt();

        for (int i = 0; i < (isabel.length | vicente.length); i++) {
            if (isabel[i] == numerodeitems) {
                System.out.println("Isabel ha hecho  " + numerodeitems + " ventas el dia " + i);
            }
            if (vicente[i] == numerodeitems){
                System.out.println("Vicente ha hecho " + numerodeitems + " ventas el dia " + i);
            }
        }
    }
}