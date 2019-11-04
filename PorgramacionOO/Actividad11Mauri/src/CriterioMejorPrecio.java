public class CriterioMejorPrecio implements selectorDeMejorProducto {
    @Override
    public Producto elegirMejorProducto(LoteDeProductos lote) {
        double menorPrecio = Double.MAX_VALUE;
        Producto productoMasBarato = null;
        for ( int i = 0; i < lote.getTotalProducto(); i++){
            Producto productoActual = lote.getProductoEnPosicion(i);
            double precioActual = productoActual.getPrecio();
            if (precioActual < menorPrecio){
                menorPrecio = precioActual;
                productoMasBarato = productoActual;
            }
        }
        return productoMasBarato;
    }
}
