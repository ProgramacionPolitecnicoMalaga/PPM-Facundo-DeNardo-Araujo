package SRP;

public class App {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Carlos Garcia");
        Empleado e2 = new Empleado("Pepe Perez");
        Contabilidad cont = new Contabilidad();
        RecursosHumanos recHum = new RecursosHumanos();

        e1.setHorasTrabajadas(8,0);
        e1.setHorasTrabajadas(6,1);
        e1.setHorasTrabajadas(9,2);
        e1.setHorasTrabajadas(3,3);
        e1.setHorasTrabajadas(6,4);

        e2.setHorasTrabajadas(6,0);
        e2.setHorasTrabajadas(6,1);
        e2.setHorasTrabajadas(8,2);
        e2.setHorasTrabajadas(2,3);
        e2.setHorasTrabajadas(5,4);

        cont.añadirEmpleado(e1);
        cont.añadirEmpleado(e2);
        recHum.añadirEmpleado(e1);
        recHum.añadirEmpleado(e2);

        System.out.println("E1 (sueldo): " + cont.getSueldo("Carlos Garcia"));
        System.out.println("E1 (horas): " + recHum.getHorasTrabajadas("Carlos Garcia"));
        System.out.println("E2 (sueldo): " + cont.getSueldo("Pepe Perez"));
        System.out.println("E2 (horas): " + recHum.getHorasTrabajadas("Pepe Perez"));

    }
}
