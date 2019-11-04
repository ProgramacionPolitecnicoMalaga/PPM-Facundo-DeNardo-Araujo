import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        int[] isabel = {7, 7, 10, 6, 4};
        int[] vicente = {4, 7, 5, 4, 5};
        Scanner sc = new Scanner(System.in);
        int mayorventadeldia_i = 0;
        int mayorventadeldia_v = 0;
        int vendedor_semana;
        double media_ventas_isabel= ((isabel[0] + isabel[1] + isabel[2] + isabel[3] + isabel[4])/isabel.length);
        System.out.println(media_ventas_isabel);

        for (int i = 0; i < (isabel.length | vicente.length); i++) {
            if (mayorventadeldia_i < isabel[i]) {
                mayorventadeldia_i = isabel[i];
            }if (mayorventadeldia_v < vicente[i]){
                mayorventadeldia_v = vicente[i];
            }
        }
    }
}
