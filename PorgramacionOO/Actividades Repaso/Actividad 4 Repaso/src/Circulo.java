public class Circulo extends Figura {
    int radio;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    public void calcularArea(){
        double area = Math.PI * radio;
        setArea(area);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
