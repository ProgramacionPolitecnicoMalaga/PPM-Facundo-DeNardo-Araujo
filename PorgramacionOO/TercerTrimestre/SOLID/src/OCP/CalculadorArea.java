package OCP;

import java.util.ArrayList;

public class CalculadorArea {

    ArrayList<Figura> figuras;

    public CalculadorArea(){
        figuras = new ArrayList<>();
    }

    public void calcularAreas(){
        double area;
        for (Figura figuras : figuras){
            figuras.area();
        }
    }

    public void addFigura(Figura fig){
        figuras.add(fig);
    }

}
