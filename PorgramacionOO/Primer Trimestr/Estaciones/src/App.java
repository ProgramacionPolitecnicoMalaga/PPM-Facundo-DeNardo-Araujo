import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //CARGAR DATOS

        ArchivoXML GeneradorXML = new ArchivoXML("estaciones.xml");
        GeneradorXML.abrir();
        Ciudades ciudades = GeneradorXML.leerCiudades();
        System.out.println(ciudades);



        //-Consultar las ciudades en las que hay una estación
        //-Consultar las estaciones en una ciudad
        //-Consultar las estaciones de un cierto tipo
        //-Consultar las estacion mas cercana a mi ubicación actual



    }
}
