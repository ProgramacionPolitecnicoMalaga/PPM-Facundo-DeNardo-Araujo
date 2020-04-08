import org.apache.commons.math3.analysis.function.Multiply;

public class Multiplicar {
    Multiply multiplicacion = new Multiply();

    public double mult(double a, double b){
        return multiplicacion.value(a,b);
    }
}
