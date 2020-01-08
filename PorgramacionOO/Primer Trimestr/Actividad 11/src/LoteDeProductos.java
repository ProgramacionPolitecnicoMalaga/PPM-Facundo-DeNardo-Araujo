import java.lang.reflect.Array;

public class LoteDeProductos implements SelectorDeMejorProducto {

    Productos[] herramientas;
    int n = 0;
    double masbarato, mvalorado;

    public LoteDeProductos(){
        herramientas = new Productos[5];
    }


    public void getTotalProductos(){
        int contadorLote = 0;
        for (int i = 0; i < herramientas.length; i++){
            if (herramientas[i] != null){
                contadorLote++;
            }
        }
        System.out.println(contadorLote);;
    }


    public void getProductoEnPosicion(int i){
        System.out.println(herramientas[i]);
    }


    public void añadirProducto(Productos Producto){
        herramientas[n] = Producto;
        n++;
    }

    public void mostrarLoteCompleto(){
        for (int i = 0; i < herramientas.length; i++){
            if (herramientas[i] != null){
                System.out.println(herramientas[i]);
            }
        }
    }

    @Override
    public int masBarato() {
        int posicionProductoMasBarato = 0;
        double masbarato = Double.MAX_VALUE;
        for (int i = 0; i <= herramientas.length; i++){
            if (masbarato >= herramientas[i].getPrecio()){
                masbarato = herramientas[i].getPrecio();
                posicionProductoMasBarato = i;
            }
        }
        return posicionProductoMasBarato;
    }


    @Override
    public void mejorValorado() {
        for (int i = 0; i < herramientas.length; i++){

        }

    }

    @Override
    public void valoracionPrecio() {

    }
}
