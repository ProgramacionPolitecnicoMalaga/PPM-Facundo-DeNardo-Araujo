public class Cuadrado extends Figura {
    double base;
    double altura;

    public Cuadrado(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        double area = base * altura;
        setArea(area);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "base=" + base +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
