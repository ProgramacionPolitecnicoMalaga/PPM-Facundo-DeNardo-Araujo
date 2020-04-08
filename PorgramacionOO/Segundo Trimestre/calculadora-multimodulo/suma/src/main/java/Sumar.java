import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class Sumar {
    Sum sumar = new Sum();

    public  Double sum(double[] numeros){
        return sumar.evaluate(numeros,0,numeros.length);
    }
}
