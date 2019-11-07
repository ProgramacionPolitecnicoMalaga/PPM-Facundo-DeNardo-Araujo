public class Pila {
    int arrayPila[];
    int recorer;
    int otravariable;
    static final int LONGITUD_MAXIMA = 1000;
    int n = 0;
    int contador;

    public Pila(){
        arrayPila = new int[LONGITUD_MAXIMA];
    }

    public void mostrarPila(){
        for (int i = 0; i < LONGITUD_MAXIMA; i++){
            if (arrayPila[i] != 0){
                System.out.println(arrayPila[i]);
            }
        }
    }
    public void insertar(int añadir) {
        arrayPila[n] = añadir;
        n++;
    }
    public void extraer() throws ExepcionFueraDeRango{
        for (int i = arrayPila.length -1; i >= 0; i--){
            if (arrayPila[i] != 0) {
                arrayPila[i] = 0;
                break;
            }

        }
    }
    public void cima(){
        for (int i = arrayPila.length -1; i > 0; i--){
            if (arrayPila[i] != 0) {
                System.out.println(arrayPila[i]);
                break;
            }
        }
    }
    public void longitud(){
        for (int i = 0; i < arrayPila.length; i++){
            if (arrayPila[i] != 0) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
