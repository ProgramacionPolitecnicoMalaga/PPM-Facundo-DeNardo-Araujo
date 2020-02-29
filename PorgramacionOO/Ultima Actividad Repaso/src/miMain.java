import java.util.ArrayList;

public class miMain {
    public static void main(String[] args) {
        GeneradorXML generadorXML = new GeneradorXML("vehiculos.xml");
        generadorXML.abrir();
        ArrayList<Vehiculo> vehiculos = generadorXML.cargar();
        System.out.println(vehiculos);

    }
}
