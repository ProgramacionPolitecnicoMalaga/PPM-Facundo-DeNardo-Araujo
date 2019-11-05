import java.lang.reflect.Array;

public class main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};

        try{
        System.out.println(array[6]);
    }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("posicion fuera de rango");
        }finally {
            System.out.println("ad");
        }
    }
}
