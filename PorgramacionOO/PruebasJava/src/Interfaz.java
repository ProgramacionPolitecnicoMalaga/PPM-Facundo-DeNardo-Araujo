import java.util.Scanner;

public class Interfaz {
    Scanner sc = new Scanner(System.in);
    String nombreEmp;
    String apellidoEmp;
    String dniEmp;
    int ventasCom;
    int horasTrabajadas;
    int n = 0;
    int n2 = 0;
    int n3 = 0;
    boolean salir = false;
    Comisionados[] baseDatosCom = new Comisionados[100];
    PorHoras[] baseDatosPH = new PorHoras[100];
    Asalariados[] baseDatosAs = new Asalariados[100];


    public  void menuPrincipal(){
        while (!salir) {
            System.out.println("Por favor, seleccione que tipo de empleado desea introducir:\n" +
                    "1) Comisionado\n" +
                    "2) Empleado por horas\n" +
                    "3) Empleado asalariado\n" +
                    "4) Mostrar Empleados guardados\n"+
                    "5)SALIR");
            int opcionElegida = sc.nextInt();
            switch (opcionElegida) {
                case 1:
                    System.out.println("Introduzca el nombre del Empleado");
                    nombreEmp = sc.next();
                    System.out.println("Introduzca los apellidos del Empleado");
                    apellidoEmp = sc.next();
                    System.out.println("Introduzca DNI del Empleado");
                    dniEmp = sc.next();
                    System.out.println("Introduzca el numero de ventas del Comisionado");
                    ventasCom = sc.nextInt();
                    baseDatosCom[n] = new Comisionados(nombreEmp, apellidoEmp, dniEmp, ventasCom);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Nombre: " + baseDatosCom[n].getNombre());
                    System.out.println("Apellido: " + baseDatosCom[n].getApellidos());
                    System.out.println("Con DNI: " + baseDatosCom[n].getDni());
                    System.out.println("Ha realizado " + baseDatosCom[n].getNumeroDeVentas() + " ventas.");
                    System.out.println("Tiene un salario total de: " + baseDatosCom[n].getSalarioTotal());
                    System.out.println("-------------------------------------------------------");
                    n++;
                    break;
                case 2:
                    System.out.println("Introduzca el nombre del Empleado");
                    nombreEmp = sc.next();
                    System.out.println("Introduzca los apellidos del Empleado");
                    apellidoEmp = sc.next();
                    System.out.println("Introduzca DNI del Empleado");
                    dniEmp = sc.next();
                    System.out.println("Introduzca el numero de horas trabajadas");
                    horasTrabajadas = sc.nextInt();
                    baseDatosPH[n2] = new PorHoras(nombreEmp, apellidoEmp, dniEmp, horasTrabajadas);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Nombre: " + baseDatosPH[n2].getNombre());
                    System.out.println("Apellido: " + baseDatosPH[n2].getApellidos());
                    System.out.println("Con DNI: " + baseDatosPH[n2].getDni());
                    System.out.println("Ha trabajado " + horasTrabajadas);
                    System.out.println("Tiene un salario de: " + baseDatosPH[n2].getSalario());
                    System.out.println("-------------------------------------------------------");
                    n2++;
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del Empleado");
                    nombreEmp = sc.next();
                    System.out.println("Introduzca los apellidos del Empleado");
                    apellidoEmp = sc.next();
                    System.out.println("Introduzca DNI del Empleado");
                    dniEmp = sc.next();
                    baseDatosAs[n3] = new Asalariados(nombreEmp, apellidoEmp, dniEmp);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Nombre: " + baseDatosAs[n3].getNombre());
                    System.out.println("Apellido: " + baseDatosAs[n3].getApellidos());
                    System.out.println("Con DNI: " + baseDatosAs[n3].getDni());
                    System.out.println("Tiene un  sueldo fijo de: " + baseDatosAs[n3].getSalario());
                    System.out.println("-------------------------------------------------------");
                    n3++;
                    break;
                case 4:
                    for (int i = 0; i < baseDatosCom.length; i++){
                        if (baseDatosCom[i] != null) {
                            System.out.println("-----------------------COMISIONADO----------------------\n" +
                                                "Nombre: " + baseDatosCom[i].getNombre() + "\n" +
                                                "Apellidos: " + baseDatosCom[i].getApellidos() + "\n" +
                                                "Con DNI: " + baseDatosCom[i].getDni() + "\n" +
                                                "Sueldo total: " + baseDatosCom[i].getSalarioTotal() +
                                                "\n-------------------------------------------------------\n");
                        }
                    }
                    for (int i = 0; i < baseDatosPH.length; i++){
                        if (baseDatosPH[i] != null) {
                            System.out.println("-----------------------Por Horas-------------\n" +
                                    "Nombre: " + baseDatosPH[i].getNombre() + "\n" +
                                    "Apellidos: " + baseDatosPH[i].getApellidos() + "\n" +
                                    "Con DNI: " + baseDatosPH[i].getDni() + "\n" +
                                    "Sueldo total: " + baseDatosPH[i].getSalario() +
                                    "\n-------------------------------------------------------\n");
                        }
                    }
                    for (int i = 0; i< baseDatosAs.length; i++){
                        if (baseDatosAs[i] != null) {
                            System.out.println("-------------------Asalariado----------------\n" +
                                    "Nombre: " + baseDatosAs[i].getNombre() + "\n" +
                                    "Apellidos: " + baseDatosAs[i].getApellidos() + "\n" +
                                    "Con DNI: " + baseDatosAs[i].getDni() + "\n" +
                                    "Sueldo total: " + baseDatosAs[i].getSalario() +
                                    "\n-------------------------------------------------------\n");
                        }
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Por favor seleccione una opcion valida.");
            }
        }
    }
}
