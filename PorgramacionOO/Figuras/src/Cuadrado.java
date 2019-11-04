public class Cuadrado extends Figuras {
    private int lado;
    int area;

    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
        area = lado * lado;
    }

    @Override
    public int getArea(){
        this.area = lado * lado;
        return area;
    }
}
