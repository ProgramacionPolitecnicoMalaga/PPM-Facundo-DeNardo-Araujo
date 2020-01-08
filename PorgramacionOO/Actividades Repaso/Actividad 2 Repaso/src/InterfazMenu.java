public class InterfazMenu {
    public InterfazMenu(){}

    public void MenuPrincipal(){
        System.out.println(
                "1. Empleados que vendieron un número de items" + "\n" +
                        "2. Obtener el promedio de ventas de cada uno" + "\n" +
                        "3. Averiguar quién han conseguido el mayor número de ventas en un día" + "\n" +
                        "4. Insertar un nuevo empleado y sus ventas" + "\n" +
                        "5. Salir"
        );
    }

    public void numeroVentasBuscada(){
        System.out.println("Indique el numero de ventas que desea buscar : ");
    }

    public void comercialesEncontrados(){
        System.out.println(
                "Los comerciales con esas ventas son : "
        );
    }

    public void promedios(){
        System.out.println(
                "Los promedios de los empleados son : "
        );
    }

    public void registroEmpleado(){
        System.out.println("Indique el nombre del Empleado:");
    }
    public void indicarVentas(){
        System.out.println("Indique el numero de ventas:");
    }

    public void registroCompleto(Comercial com){
        System.out.println(
                "Se ha registrado a " + com.toString()
        );
    }
}
