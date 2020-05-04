import java.io.IOException;

public class Suma {

    public static int sumar(int a, int b ) throws IOException {
        MiLog miLog = new MiLog();
        miLog.controlarValores(a,b);
        return a + b;
    }
}
