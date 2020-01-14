import java.util.ArrayList;

public class MiMain {
    public static final int EMPLEADOS_QUE_VENDIERON_N_ITEMS = 1;
    public static final int OBTENER_PROMEDIO_VENDA_POR_EMPLEADO = 2;
    public static final int MAYOR_VENTA_EN_UN_DIA = 3;
    public static final int INSERTAR_NUEVO_EMPLEADO = 4;

    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        Comerciales comerciales = new Comerciales();
        Operaciones operaciones = new Operaciones();
        Comercial com1 = new Comercial("Isabel");
        com1.addVenta(7);
        com1.addVenta(7);
        com1.addVenta(10);
        com1.addVenta(5);
        com1.addVenta(6);
        Comercial com2 = new Comercial("Vicente");
        com2.addVenta(7);
        com2.addVenta(4);
        com2.addVenta(5);
        com2.addVenta(6);
        com2.addVenta(2);
        comerciales.registrarComercial(com1);
        comerciales.registrarComercial(com2);

        int opcion = interfaz.printMenuPrincipal();
        while (opcion != 5) {
            switch (opcion) {
                case EMPLEADOS_QUE_VENDIERON_N_ITEMS:
                    int ventaBuscada = interfaz.empleadosItems();
                    ArrayList<Comercial> coincidencias = operaciones.coincidenciasDeVenta(ventaBuscada, comerciales);
                    interfaz.resultadosEmpItems(coincidencias, ventaBuscada);
                    opcion = interfaz.printMenuPrincipal();
                    break;
                case OBTENER_PROMEDIO_VENDA_POR_EMPLEADO:
                    interfaz.promediosVenta(operaciones.obtenerPromediosVenta(comerciales));
                    opcion = interfaz.printMenuPrincipal();
                    break;
                case MAYOR_VENTA_EN_UN_DIA:
                    interfaz.comercialConMayorventa(operaciones.obtenerComConMayorVenta(comerciales));
                    opcion = interfaz.printMenuPrincipal();
                    break;
                case INSERTAR_NUEVO_EMPLEADO:
                    Comercial com = new Comercial(interfaz.registrarNombreEmpleado());
                    comerciales.registrarComercial(com);
                    interfaz.indicarVentas();
                    opcion = interfaz.printMenuPrincipal();
                    break;
            }
        }
    }
}
