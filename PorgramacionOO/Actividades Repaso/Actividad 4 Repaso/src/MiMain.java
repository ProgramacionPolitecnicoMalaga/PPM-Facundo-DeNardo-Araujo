public class MiMain {
    public static void main(String[] args) {
        Figura fig0 = new Circulo("Rojo", 15);
        Figura fig1 = new Cuadrado("Azul", 10.5,10.5);
        Figura fig2 = new Triangulo("Amarillo", 20.5,20.5);

        Figura[] figuras = new Figura[3];
        figuras[0] = fig0;
        figuras[1] = fig1;
        figuras[2] = fig2;

        for (int i = 0; i < figuras.length; i ++){
            figuras[i].calcularArea();
        System.out.println(figuras[i]);
        }
    }
}
