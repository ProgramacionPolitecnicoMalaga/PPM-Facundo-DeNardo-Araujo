import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CSVMannager {

    public CSVMannager(){

    }

    public Airports csvToAirports(String fileName){
        Airports aeropuertos = new Airports();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split(",");
                Airport aeropuerto = new Airport(new Pais(fields[3].replace("\"", "")),fields[1].replace("\"", ""),fields[4].replace("\"", ""),fields[2].replace("\"", ""),fields[6],fields[7]);
                aeropuertos.addAirport(aeropuerto);
                line = br.readLine();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return aeropuertos;
    }

    public Paises csvToPaises(String fileName){
        Paises paises = new Paises();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split(",");
                Pais pais = new Pais(fields[3].replace("\"", ""));
                paises.addPais(pais);
                Set<Pais> hs = new HashSet<>();
                hs.addAll(paises.listaPaises);
                paises.listaPaises.clear();
                paises.listaPaises.addAll(hs);
                line = br.readLine();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paises;
    }

    public Paises csvToPaises2(String fileName){
        Paises paises = new Paises();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split(",");
                Pais pais = new Pais(fields[6].replace("\"", ""));
                paises.addPais(pais);
                Set<Pais> hs = new HashSet<>();
                hs.addAll(paises.listaPaises);
                paises.listaPaises.clear();
                paises.listaPaises.addAll(hs);
                line = br.readLine();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paises;
    }

    public Airlines CSVToAirlines(String fileName){
        Airlines aerolineas = new Airlines();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split(",");
                Airline airline = new Airline(fields[0],fields[1].replace("\"",""),fields[4].replace("\"","") ,fields[5].replace("\"",""), new Pais(fields[6].replace("\"","")));
                aerolineas.addAirline(airline);
                line = br.readLine();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return aerolineas;
    }
}
