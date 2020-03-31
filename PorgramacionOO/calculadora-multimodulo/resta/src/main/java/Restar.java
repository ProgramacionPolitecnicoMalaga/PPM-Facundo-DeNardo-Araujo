import org.apache.commons.math3.analysis.function.Subtract;

public class Restar {
    Subtract sub = new Subtract();

    public double rest(double a, double b){
        return sub.value(a,b);
    }
}
