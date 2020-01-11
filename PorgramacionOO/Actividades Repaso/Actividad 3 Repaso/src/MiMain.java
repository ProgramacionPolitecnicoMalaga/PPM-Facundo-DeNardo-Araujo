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

        //GENERO LA NOMINA DE CADA EMPLEADO
        nominasGenerator.calNominaAsalariado(emp0);
        nominasGenerator.calNominaPorHoras(emp1);
        nominasGenerator.calNominaComisionado(emp2);

        //AÑADO LOS EMPLEADOS A LA BASE DE DATOS
        baseDatosEmpleados.addEmpleado(emp0);
        baseDatosEmpleados.addEmpleado(emp1);
        baseDatosEmpleados.addEmpleado(emp2);

        //MUESTRO LOS EMPLEADOS REGISTRADOS EN LA BBDD
        System.out.println(baseDatosEmpleados);



    }
}
