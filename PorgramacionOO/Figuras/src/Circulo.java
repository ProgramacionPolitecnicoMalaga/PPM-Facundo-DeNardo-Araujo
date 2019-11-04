public class Circulo extends Figuras {
    private int radio;
    double area;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public int getArea(){
        area = Math.PI * (radio * radio);
        return (int) area;
    }
}
