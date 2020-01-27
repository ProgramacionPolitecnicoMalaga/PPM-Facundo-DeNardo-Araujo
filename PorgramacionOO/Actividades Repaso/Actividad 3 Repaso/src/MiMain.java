public class MiMain {
    public static void main(String[] args) {
        //CREO LOS EMPLEADOS, LA BASE DE DATOS Y EL GENERADOR DE NOMINAS
        Asalariado emp0 = new Asalariado("Pepe","Gonzalez","12345678L");
        PorHoras emp1 = new PorHoras("Paco", "Hernandez", "87654321P");
        Comisionado emp2 = new Comisionado("Luis", "Herrera", "84563216Y");
        BaseDatosEmpleados baseDatosEmpleados = new BaseDatosEmpleados();
        NominasGenerator nominasGenerator = new NominasGenerator();

        emp1.setnHorasTrabajadas(56);
        emp2.setnVentas(45);

        //GENERA NOMINA Y AÑADE AL EMPLEADO
        baseDatosEmpleados.addEmpleado(nominasGenerator.calNominaAsalariado(emp0));
        baseDatosEmpleados.addEmpleado(nominasGenerator.calNominaPorHoras(emp1));
        baseDatosEmpleados.addEmpleado(nominasGenerator.calNominaComisionado(emp2));

        //MUESTRO LOS EMPLEADOS REGISTRADOS EN LA BBDD
        System.out.println(baseDatosEmpleados);
    }
}
