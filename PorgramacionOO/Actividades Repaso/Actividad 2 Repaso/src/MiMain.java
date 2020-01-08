import java.util.Scanner;

public class MiMain {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            InterfazMenu interfazMenu = new InterfazMenu();
            int opcionElegida;
            Operaciones operaciones = new Operaciones();
            Comercial com1 = new Comercial("Isabel Castillo");
            Comercial com2 = new Comercial("Vicente Calzado");
            Comerciales comerciales = new Comerciales();
            com1.addVenta(7);
            com1.addVenta(7);
            com1.addVenta(10);
            com1.addVenta(6);
            com1.addVenta(4);
            com2.addVenta(4);
            com2.addVenta(7);
            com2.addVenta(5);
            com2.addVenta(4);
            com2.addVenta(5);
            comerciales.RegistrarComercial(com1);
            comerciales.RegistrarComercial(com2);

            operaciones.buscarNventas(comerciales, 7);



    }
}
