public class Main {
    public static void main(String[] args) {

    LoteDeProductos herramientas = new LoteDeProductos();
    Productos prod1 = new Productos("martillo", 10.5, 5);
    Productos prod2 = new Productos("Destorinillador", 7.00,4);
    Productos prod3 = new Productos("Clavos", 0.5,2);
    Productos prod4 = new Productos("Radial", 70, 1);
    Productos prod5 = new Productos("Cierra", 34,3);

    herramientas.añadirProducto(prod1);
    herramientas.añadirProducto(prod2);
    herramientas.añadirProducto(prod3);
    herramientas.añadirProducto(prod4);
    herramientas.añadirProducto(prod5);
    herramientas.masBarato();


        }
    }

