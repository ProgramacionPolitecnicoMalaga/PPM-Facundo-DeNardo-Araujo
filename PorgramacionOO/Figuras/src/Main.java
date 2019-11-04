public class Main {
    public static void main(String[] args) {
        Figuras[] baseDatosFiguras = new Figuras[20];
        baseDatosFiguras[0] = new Cuadrado("Rojo",3);
        baseDatosFiguras[1]= new Triangulo("Azul", 10,12);
        baseDatosFiguras[2] = new Circulo("Amarillo", 5);


        for (int i = 0; i<baseDatosFiguras.length; i++){
            if (baseDatosFiguras[i] != null) {
                System.out.println("--------------------------------------------\n" +
                        "Tipo de figura: " + baseDatosFiguras[i].getClass() + "\n" +
                        "Color de la Figura: " + baseDatosFiguras[i].getColor() + "\n" +
                        "El area de la Figura es: " + baseDatosFiguras[i].getArea() + "\n" +
                        "--------------------------------------------\n");
            }
        }
    }
}
