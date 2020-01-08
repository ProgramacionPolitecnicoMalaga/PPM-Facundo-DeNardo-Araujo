public class InterfazMenu {

    public InterfazMenu(){
    }

    public void imprimirMenu(){
        System.out.println(
              "Que unidad desea utilizar ?" + "\n" +
              "1. mm" + "\n" +
              "2. cm" + "\n" +
              "3.m" + "\n"   +
              "Elige una opcion: "
        );
    }

    public void imprimirMenu2(){
        System.out.println(
                "¿Que operacion desea realizar?" + "\n" +
                        "1. Calcular la hipotenusa de un triangulo a partir de sus catetos." + "\n" +
                        "2. Calcular un cateto de un triangulo a partir de el otro cateto y la hipotenusa" + "\n" +
                        "3. Calcular el area de un triangulo a partir de un cateto y la hipotenusa" + "\n" +
                        "4. Calcular el area de un triangulo a partir de dos catetos" + "\n" +
                        "Elige una opcion: "
        );
    }
    public void opcionNoValida(){
        System.out.println("OPCION NO VÁLIDA");
    }

    public void pedirHipo(){
        System.out.println("Indroduzca valor HIPOTENUSA");
    }

    public void pedirCat(){
        System.out.println("Introduzca valor CATETO");
    }

    public void mostrarResultados(double resultado, String unidad){
        Double.toString(resultado);
        System.out.println("EL RESULTADO ES : " + resultado + unidad);
    }
}
