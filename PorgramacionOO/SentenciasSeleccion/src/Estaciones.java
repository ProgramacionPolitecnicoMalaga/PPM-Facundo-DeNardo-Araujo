public class Estaciones {
    public static void main(String[] args) {
        int meses[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int mes  = 2;

        switch (mes) {
            case 12: case 1: case 2:
                System.out.println("invierno");
                break;
            case 3: case 4: case 5:
                System.out.println("primavera");
                break;
            case 6: case 7: case 8:
                System.out.println("verano");
                break;
            case 9: case 10: case 11:
                System.out.println("otoño");
        }
    }
}
