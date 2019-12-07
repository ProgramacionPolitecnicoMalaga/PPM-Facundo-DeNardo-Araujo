public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("P1");
        Producto p2 = new Producto("P2");
        Inventario inv1 = new Inventario();

        p1.setComponentesNecesarios(new Componente("C1", 7));
        p1.setComponentesNecesarios(new Componente("C2", 10));
        p1.setComponentesNecesarios(new Componente("C3",4));




    }
}
