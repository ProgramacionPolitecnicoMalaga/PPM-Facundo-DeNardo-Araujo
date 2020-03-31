import org.apache.commons.math3.analysis.function.Divide;

public class Dividir {
    Divide div = new Divide();

    public double div(double a, double b){
        return div.value(a,b);
    }

}
