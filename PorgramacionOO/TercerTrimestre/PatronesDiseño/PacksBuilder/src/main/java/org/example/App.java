package org.example;

import org.example.Modelo.Servicio;
import org.example.ServicioBuilder.ServicioBuilder;
import org.example.ServicioBuilder.ServicioDirector;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println(
                "Que pack desea contratar ? \n" +
                        "1. Pack Basico \n" +
                        "2. Pack Romance \n" +
                        "3. Pack Familiar \n" +
                        "4. Pack Padres Relajados \n" +
                        "5. Pack Deluxe \n" +
                        "6. Pack Deluxe Familiar"
        );
        int opcionElegida = Integer.parseInt(sc.next());
        ServicioBuilder servicioBuilder = new ServicioBuilder();
        ServicioDirector servicioDirector = new ServicioDirector(servicioBuilder);
        Servicio servicio = null;

        switch (opcionElegida){
            case 1:
                servicio = servicioDirector.ofrecerServicioBascio();
                break;
            case 2:
                servicio = servicioDirector.ofrecerPackRomance();
                break;
            case 3:
                servicio = servicioDirector.ofrecerPackFamiliar();
                break;
            case 4:
                servicio = servicioDirector.ofrecerPackPadreRelajados();
                break;
            case 5:
                servicio = servicioDirector.ofrecerPackDeluxe();
                break;
            case 6:
                servicio = servicioDirector.ofrecerPackDeluxeFamiliar();
                break;
        }

        System.out.println(servicio);
    }
}
