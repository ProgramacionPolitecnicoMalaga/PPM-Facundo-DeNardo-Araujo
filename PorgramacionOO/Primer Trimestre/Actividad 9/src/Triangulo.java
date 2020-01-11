public class Triangulo extends Figuras {
    int base;
    int altura;
    int area;

    public Triangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int getArea() {
        area = (base * altura)/2;
        return area;
    }
}
