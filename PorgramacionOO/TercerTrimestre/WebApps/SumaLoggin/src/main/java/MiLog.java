import java.io.IOException;
import java.util.logging.*;

public class MiLog {
    private static final Logger LOGGER = Logger.getLogger("MiLogger");
    Handler FILEHANDLER = new FileHandler("/opt/tomcat/latest/logs/Suma.log", true);
    SimpleFormatter simpleFormatter = new SimpleFormatter();



    public MiLog() throws IOException {
        LOGGER.addHandler(FILEHANDLER);
        FILEHANDLER.setFormatter(simpleFormatter);
        FILEHANDLER.setLevel(Level.ALL);
    }

    public void controlarValores(int a, int b){
        LOGGER.log(Level.INFO, "LOS VALORES RECIBIDOS FUERON : " + a + " Y " + b);
    }

    public void controlarValoresASumar(int a, int b){
        LOGGER.log(Level.INFO, "a = " + a + "  b = " + b);
    }

    public void controlarResultado(int resultado){
        LOGGER.log(Level.INFO, "EL RESULTADO DE LA SUMA ES: " + resultado);
    }

    public void autoria(){
        LOGGER.log(Level.INFO, "ESTA APP PERTENECE A FACUNDO DE NARDO");
    }
}
