import java.io.FileWriter;
import java.io.PrintWriter;

public class MiMain {
    public static void main(String[] args){
        double inicio = System.currentTimeMillis();

        //GENERAR XML DESDE CSV
        CSVMannager csvMannager = new CSVMannager();
        Airports ListaAeropuertos = csvMannager.csvToAirports("airports.csv");
        Paises paises = csvMannager.csvToPaises("airports.csv");

        //GENERAR XML AEROPUERTOS
        XMLMannager xmlMannager = new XMLMannager();
        xmlMannager.XMLAeropuertosPaises(paises,ListaAeropuertos);

        //GENERAR XML AEROLINEAS
        Airlines airlines = csvMannager.CSVToAirlines("airlines.csv");
        Paises paises1 = csvMannager.csvToPaises2("airlines.csv");
        xmlMannager.XMLPaisesAerolineas(paises1,airlines);

        //tiempo total en ejecutar
        double total = (System.currentTimeMillis() - inicio) / 1000.0;
        System.out.println( "Tiempo total en crear XML: " + total + " Segundos.");

        //XML A CSV Aerolineas
        xmlMannager.XMLaCSVAirlines("airlines.xml");

        //XML A CSV Aeropuertos
        xmlMannager.XMLaCSVAirports("airports.xml");


    }

}
