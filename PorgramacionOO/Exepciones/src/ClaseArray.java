public class ClaseArray {
    private static final int TAMAÑO_ARRAY = 5;
    int[] array = new int[TAMAÑO_ARRAY];

    public ClaseArray(){
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
    }

    public static int getElemnto(int i) throws ElementoNoExistenteExeption {
        if ((i < 0) || (i>4))
            throw new ElementoNoExistenteExeption("Indice fuera de rango", 4);
        else
            return array[i];
    }
}
