import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class TrabajandoConBucles {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < array1.length; i++){
            System.out.println("el bucle " + i);
            System.out.println("valor de la posición " + i + ": " + array1[i]);
        }



    }
}





//////////////////////////FOR////////////////////////////////////////////////////////

//i es el indice//longitud del array    //lo q va a ocurrir en cada iteracion del bucle
/*
        for (int i = 0; i <temperaturaDia.length; i++){
        System.out.println("temperatura de la hora " + i + ":00 => " + temperaturaDia[i]);
        if (maximaTemperatura < temperaturaDia[i])
        maximaTemperatura = temperaturaDia[i];
        }
        System.out.println("la temperatura maxima ha sido "+ maximaTemperatura);
        System.out.println("a la hora ");
*/

/////////////////////// WHILE Y SWITCH ////////////////////////////////////////////////



            /*
            boolean encontrado = false;
        int[] ventas = {2,3,7,1,0};
        int ventasDeInteres = 9;
        int diaDeInteres;
        int dia = 0;

            while ((!encontrado) && (dia < 5)){
            if (ventas[dia] == ventasDeInteres)
                encontrado = true;
            else
                dia++;
        }

        switch (dia){
            case 0:
                System.out.println("Lunes");
                break;
            case 1:
                System.out.println("Martes");
                break;
            case 2:
                System.out.println("Miercoles");
                break;
            case 3:
                System.out.println("Jueves");
                break;
            case 4:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Nose vendieron " + ventas + " ningun dia ");

        }

         */
