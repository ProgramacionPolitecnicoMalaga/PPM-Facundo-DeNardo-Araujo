import java.util.ArrayList;
import java.util.Scanner;

public class MiMain {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); //creamos Scanner para recoger los datos introducidos por consola
            InterfazMenu interfazMenu = new InterfazMenu(); //Se encarga de imprimir los menus por consola
            Comercial com1 = new Comercial("Isabel Castillo");
            Comercial com2 = new Comercial("Vicente Calzado");//Creamos los dos comerciales
            com1.addVentas(7, 7, 10, 6, 4);
            com2.addVentas(4, 7, 5, 4, 5);//les introducimos las ventas realizadas

            interfazMenu.MenuPrincipal();
            int operacion =  sc.nextInt();
            while (operacion != 5) {
                    switch (operacion){
                            case 1:
                                    interfazMenu.numeroVentasBuscada();
                                    int nVentas = sc.nextInt();
                                    interfazMenu.comercialesEncontrados();
                                    if (com1.buscarVenta(nVentas))
                                            System.out.println(com1.toString());
                                    if (com2.buscarVenta(nVentas))
                                            System.out.println(com2.toString());
                                    interfazMenu.MenuPrincipal();
                                    operacion =  sc.nextInt();
                                    break;
                            case 2:
                                    interfazMenu.promedios();
                                    if (com1.calcularPromVentas() > com2.calcularPromVentas())
                                            System.out.println(
                                                    com1.toString() + "   " + com1.calcularPromVentas() + "  *" + "\n" +
                                                            com2.toString() + "   " + com2.calcularPromVentas()
                                            );
                                    interfazMenu.MenuPrincipal();
                                    operacion =  sc.nextInt();
                                    break;
                            case 3:
                                    if (com1.buscarVentaMasAlta() > com2.buscarVentaMasAlta())
                                            System.out.println("La venta mas alta es de " + com1.toString() + " con un total de: " + com1.buscarVentaMasAlta() + " ventas.");
                                    else System.out.println("La venta mas alta es de " + com2.toString() + " con un total de: " + com2.buscarVentaMasAlta() + " ventas.");
                                    interfazMenu.MenuPrincipal();
                                    operacion =  sc.nextInt();
                                    break;
                            case 4:
                                    interfazMenu.registroEmpleado();
                                    String nombre = sc.next();
                                    Comercial com3 = new Comercial(nombre);
                                    interfazMenu.indicarVentas();
                                    int vent1 = sc.nextInt();
                                    System.out.println("venta 2:");
                                    int vent2 = sc.nextInt();
                                    System.out.println("venta 3:");
                                    int vent3 = sc.nextInt();
                                    System.out.println("venta 4:");
                                    int vent4 = sc.nextInt();
                                    System.out.println("venta 5:");
                                    int vent5 = sc.nextInt();
                                    com3.addVentas(vent1, vent2, vent3, vent4, vent5);
                                    interfazMenu.registroCompleto(com3);
                                    interfazMenu.MenuPrincipal();
                                    operacion =  sc.nextInt();
                                    break;
                    }
            }
    }
}
