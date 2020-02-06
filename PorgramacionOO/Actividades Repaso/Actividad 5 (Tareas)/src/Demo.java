import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        GestorTareas gt = new GestorTareas();

        //1) CREAR NUEVA CATEGORIA
        gt.addCategoria(new Categoria("Programacion"));
        gt.addCategoria(new Categoria("Base de Datos"));
        gt.addCategoria(new Categoria("Lenguaje Marcas"));

        //2) MOSTRAR LAS CATEGORIAS EXISTENTES
        System.out.println("2) " + gt.listaCategorias() + "\n");

        //3) CREAR UNA NUEVA TAREA
        Tarea tarea1 = new Tarea("Terminar app de tareas 0", LocalDate.of(2020,01,28));
        Tarea tarea2 = new Tarea("Terminar app de tareas 1", LocalDate.of(2020,01,29));
        Tarea tarea3 = new Tarea("Terminar app de tareas 2 ", LocalDate.of(2020,01,15));
        tarea1.setCategoria(new Categoria("Programacion"));// le pones una categoria a la tarea
        tarea2.setCategoria(new Categoria("Programacion"));
        gt.addTarea(tarea1); //añadimos las tareas a la lista de tareas general
        gt.addTarea(tarea2);
        gt.addTarea(tarea3);

        //4) CONSULTAR TAREAS PENDIENTES
        System.out.println("4) " + gt.consultarPendientes() + "\n");

        //5) ELIMINAR TAREA (completar)
        tarea1.completarTarea();
        System.out.println("5) " + gt.consultarPendientes() + "\n");

        //6) TAREAS DE UNA CATEGORIA
        System.out.println("6) " + gt.tareasDeUnaCategoria(new Categoria("Programacion")) + "\n");

        //7) CONSULTAR TAREAS PARA UNA FECHA CONCRETA
        System.out.println("7) " + gt.tareasEnFecha(LocalDate.of(2020,01,15)) + "\n");

        //8) CONSULTAR TAREAS EN TIEMPO
        System.out.println("8) " + gt.tareasEnTiempo() + "\n");

        //9) CONSULTAR TAREAS RETRASADAS
        System.out.println("9) " + gt.tareasRetrasadas() + "\n");

    }
}
