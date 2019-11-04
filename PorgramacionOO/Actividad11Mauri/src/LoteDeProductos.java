public class LoteDeProductos {

    private Producto[] productos;
    private static final int MAX_PRODUCTOS = 100;
    private int totalProductos;
    private selectorDeMejorProducto selectorDeMejorProducto;


    public LoteDeProductos(){
        totalProductos = 0;
        productos = new Producto[100];
        selectorDeMejorProducto = new CriterioMejorPrecio();
    }

    public void addProducto(Producto producto){
        if (totalProductos < productos.length){
            productos[totalProductos] = producto;
            totalProductos++;
        }
    }

    public int getTotalProducto(){
        return totalProductos;
    }

    public Producto getProductoEnPosicion(int i){
        if ((i >= 0) && (i < totalProductos))
            return productos[i];
        else
            return null;
    }


    public void setSelectorDeMejorProducto(selectorDeMejorProducto selectorDeMejorProducto) {
        this.selectorDeMejorProducto = selectorDeMejorProducto;
    }

    public Producto getSellersChoise(){
        if (selectorDeMejorProducto != null)
        return selectorDeMejorProducto.elegirMejorProducto(this);
        return null;
    }
}
