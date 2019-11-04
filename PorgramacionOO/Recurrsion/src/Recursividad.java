public class Recursividad {

    public void Imprimir(int x){
        if (x <= 10){
            System.out.print(x + " ");
            Imprimir(x + 1);
        }
    }

    public static void main(String[] args) {
        Recursividad recursividad = new Recursividad();
        recursividad.Imprimir(1);
    }
}
