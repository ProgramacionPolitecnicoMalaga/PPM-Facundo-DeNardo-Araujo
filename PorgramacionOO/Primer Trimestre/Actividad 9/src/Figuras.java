public abstract class Figuras {
    String color;


    public Figuras(String color){
        this.color = color;
    }
    public abstract int getArea();
    public String getColor(){
        return color;
    }
}