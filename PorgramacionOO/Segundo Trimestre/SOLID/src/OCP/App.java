package OCP;

public class App {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(12,22);
        Rectangulo r2 = new Rectangulo(11,22);
        Rectangulo r3 = new Rectangulo(54,22);
        Rectangulo r4 = new Rectangulo(7,22);

        CalculadorArea calculadorArea = new CalculadorArea();

        calculadorArea.addFigura(r1);
        calculadorArea.addFigura(r2);
        calculadorArea.addFigura(r3);
        calculadorArea.addFigura(r4);

    }
}
