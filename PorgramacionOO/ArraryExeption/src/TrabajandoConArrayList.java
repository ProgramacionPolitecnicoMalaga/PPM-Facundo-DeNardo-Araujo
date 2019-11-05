import java.util.ArrayList;
import java.util.Iterator;

public class TrabajandoConArrayList {

    public static boolean predicado(ClaseDePrueba elemento){
        return elemento.getValor() < 100;
    }

    public static void main(String[] args) {
        ArrayList<ClaseDePrueba> array = new ArrayList<>(); //si queremos meter int hay que poner Integer.
        ArrayList<ClaseDePrueba> array2 = new ArrayList<>();
        array2.add(new ClaseDePrueba(200,"e200"));
        array2.add(new ClaseDePrueba(201,"E201"));
        array2.add(new ClaseDePrueba(201,"e202"));



        array.add(new ClaseDePrueba(1,"e1"));
        array.add(new ClaseDePrueba(2,"e2"));
        array.add(new ClaseDePrueba(3,"e3"));
        array.add(new ClaseDePrueba(100,"e100"));
        array.add(1, new ClaseDePrueba(0,"e0"));
        array.set(1, new ClaseDePrueba(4,"e4"));
        // para hacer un add o set hay que insertarlo en una pociion que ya exista previamente, de lo contrario saltara una exepcion.
        array.remove(new ClaseDePrueba(1,"e1"));
        Iterator<ClaseDePrueba> it = array.iterator(); // reemplaza el for para recorrer el array

       //recorre entero el arraylist como un For.
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------------------------------------");
        array2.addAll(array);//metemos todos los elementos de array en array2
        System.out.println(array2);

        array.forEach(c -> {c.setCadena("-" + c.getCadena() + "-");});//las expreciones lambda nos permiten definir metodos sobre la marcha, C representa a cada uno de los objeto
        //de la clase prueba que hay en el array.
        System.out.println(array);

        array.removeIf(elemento -> predicado(elemento)); //(elemento.getvALOR()< 100

        System.out.println(array);

        System.out.println("---------------------------------------------------");

        ClaseDePrueba elementoBuscado = new ClaseDePrueba(100,"-e100-");
        Iterator<ClaseDePrueba> iterator = array.iterator();
        int i = 0;
        while (iterator.hasNext()){
            i++;
            if (elementoBuscado.equals(iterator.next()))
                System.out.println(i);
        }
        miComparador micomparador = new miComparador();
        array.sort(micomparador);
        System.out.println(array);
        array.sort( new ComparadorAlfabetico());
        System.out.println(array);
        array.sort((a,b) -> a.compareTo(b));



    }
}
