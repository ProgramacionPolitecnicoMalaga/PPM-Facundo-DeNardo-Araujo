import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;

public class ComparandoCollections {
    private static ArrayList<Double> array = new ArrayList<>();
    private static LinkedList<Double> list = new LinkedList<>();
    private static final int ITERACIONES = 100000;

    private static void inicializarListas(List<Double> lista){
        insertarNumeros(lista,10000);
        lista.add(70.0);
        insertarNumeros(lista,10000);
    }

    private static void insertarNumeros(List<Double> lista, int numerosAñadir){
        for (int i = 0 ; i < numerosAñadir ; i++){
            double aleatorio = ThreadLocalRandom.current().nextDouble(0,50);
            lista.add(aleatorio);
        }
    }

    private static double cronometrar(MetodoAEjecutar metodo){
        long[] tiempos = new long[ITERACIONES];
        for (int i = 0; i< ITERACIONES; i++){
            long inicio = System.nanoTime();
            metodo.ejecutar();
            long duracion = System.nanoTime() - inicio;
            tiempos[i] = duracion;
        }
        return Arrays.stream(tiempos).average().getAsDouble();
     }

    /*private static long cronometrarIndexOf(List<Double> lista) {
        long inicio = System.nanoTime(); //tiempo en nano segundos que han pasado desde 1970
        int pos = lista.indexOf(70.0);
        return System.nanoTime() - inicio;
    }

    private static double calcularMediaIndexOf(List<Double> lista){
        long[] tiempos = new long[ITERACIONES];
        for (int i = 0; i< ITERACIONES; i++){
            tiempos[i] = cronometrarIndexOf(lista);
        }
        return Arrays.stream(tiempos).average().getAsDouble();
    }

    private static double calcularMediaInsert(List<Double> lista, int pos) {
        long[] tiempos = new long[ITERACIONES];
        for (int i = 0; i< ITERACIONES; i++){
            tiempos[i] = cronometrarInsert(lista, pos);
        }
        return Arrays.stream(tiempos).average().getAsDouble();
    }

    private static long cronometrarInsert(List<Double> lista, int pos) {
        long inicio = System.nanoTime();
        if (pos > 0) {
            lista.add(pos, 0.0);
        }else{
            lista.add(0.0);
        }
        return System.nanoTime() - inicio;
    }

    private static double borrarCabeza(List<Double> lista){
        long inicio = System.nanoTime();
        lista.remove(0);
        return System.nanoTime() - inicio;

    }
    */

    public static void main(String[] args) {
        inicializarListas(array);
        inicializarListas(list);

        System.out.println("IndexOf de Arraylist: " + cronometrar(new MetodoAEjecutar() {
            @Override
            public void ejecutar() {
                array.indexOf(70.0);
            }
        }));

        System.out.println("IndexOf de LinkedList: " + cronometrar(new MetodoAEjecutar() {
            @Override
            public void ejecutar() {
                list.indexOf(70.0);
            }
        }));

        System.out.println("Get ArrayList: " + cronometrar(new MetodoAEjecutar() {
            @Override
            public void ejecutar() {
                array.get(1000);
            }
        }));

        System.out.println("Get LinkedList: " + cronometrar(new MetodoAEjecutar() {
            @Override
            public void ejecutar() {
                list.get(1000);
            }
        }));

        
        /*
        System.out.println("IndexOf(ArrayList): " + calcularMediaIndexOf(array));//O(n)
        System.out.println("IndexOf(LinkedList): " + calcularMediaIndexOf(list));//O(n)
        System.out.println("===================================");
        System.out.println("Insertar Principio(ArrayList): " + calcularMediaInsert(array,0));
        System.out.println("Insertar Principio(LinkedList): " + calcularMediaInsert(list,0));
        System.out.println("===================================");
        System.out.println("Insertar Mitad(ArrayList): " + calcularMediaInsert(array,array.size()/2));
        System.out.println("Insertar Mitad(LinkedList): " + calcularMediaInsert(list,list.size()/2));
        System.out.println("===================================");
        System.out.println("Insertar Final(ArrayList): " + calcularMediaInsert(array,array.size()));
        System.out.println("Insertar Final(LinkedList): " + calcularMediaInsert(list,list.size()));
        System.out.println("===================================");
        System.out.println("Borrar cabeza(ArrayList): " + borrarCabeza(array));
        System.out.println("Borrar cabeza(LinkedList): " + borrarCabeza(list));
        */
        //si la finalidad es busqueda es mejor arraylist
        //si la finalidad es añadir y borrar es mejor LinkedList


    }




}
