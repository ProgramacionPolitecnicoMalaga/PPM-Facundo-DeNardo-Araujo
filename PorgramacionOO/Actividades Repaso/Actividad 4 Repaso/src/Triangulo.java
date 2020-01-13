public class Triangulo extends Figura {
    double base;
    double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }

    public void calcularArea(){
        double area = (base * altura)/2;
        setArea(area);
    }
}
