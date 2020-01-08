import java.util.Scanner;

public class MiMain {
    public static void main(String[] args) {
        InterfazMenu menu = new InterfazMenu();
        Formulas formulas = new Formulas();
        Scanner sc = new Scanner(System.in);
        String unidadMedida = null;
        double cateto;
        double cateto2;
        double hipotenusa;

        menu.imprimirMenu();
        int opcionElegida =  sc.nextInt();
        menu.imprimirMenu2();
        int opcionElegida2 = sc.nextInt();

        if (opcionElegida > 3 || opcionElegida < 1){
            menu.opcionNoValida();
        }

        switch (opcionElegida){
            case 1:
                unidadMedida = "mm";
                break;
            case 2:
                unidadMedida = "cm";
                break;
            case 3:
                unidadMedida = "m";
                break;
        }

        switch (opcionElegida2){
            case 1:
                menu.pedirCat();
                cateto = sc.nextDouble();
                menu.pedirCat();
                cateto2 = sc.nextDouble();
                menu.mostrarResultados(formulas.HipCatetos(cateto, cateto2),unidadMedida);
                break;
            case 2:
                menu.pedirCat();
                cateto = sc.nextDouble();
                menu.pedirHipo();
                hipotenusa = sc.nextDouble();
                menu.mostrarResultados(formulas.CatHipYCat(cateto, hipotenusa), unidadMedida);
                break;
            case 3:
                menu.pedirCat();
                cateto = sc.nextDouble();
                menu.pedirHipo();
                hipotenusa = sc.nextDouble();
                menu.mostrarResultados(formulas.AreaCatEHip(cateto, hipotenusa),unidadMedida);
                break;
            case 4:
                menu.pedirCat();
                cateto = sc.nextDouble();
                menu.pedirCat();
                cateto2 = sc.nextDouble();
                menu.mostrarResultados(formulas.AreaDoscatetos(cateto, cateto2), unidadMedida);
                break;
            default:
                menu.opcionNoValida();
        }
    }
}
