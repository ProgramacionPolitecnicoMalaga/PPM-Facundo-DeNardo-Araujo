public class MiMain {
    public static void main(String[] args) {
        LoteDeProductos lote = new LoteDeProductos();
        lote.addProducto(new Producto("p1",5,4.3));
        lote.addProducto(new Producto("p2",3,3.5));
        lote.addProducto(new Producto("p3",30,4.9));

        lote.setSelectorDeMejorProducto(new CriterioMejorPrecio());

        System.out.println(lote.getSellersChoise());

        lote.setSelectorDeMejorProducto(new CriterioMejorValorado());

        System.out.println(lote.getSellersChoise());

        lote.setSelectorDeMejorProducto(new CriterioMejorRatioValoracionPrecio());
        System.out.println(lote.getSellersChoise());


        //escribir una clase q tenga un array tamaño 5 y ese array tiene un metodo que devuelve un elemento en posicion i,






    }
}
