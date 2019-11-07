import java.io.*;
import java.util.Scanner;

public class BusquedaCSV {
    public static void main(String[] args) throws FileNotFoundException {
        try(BufferedReader br = new BufferedReader(new FileReader("/Users/facundodenardo/Documents/Web/CLASE/Programacion_S11AW/FacundoDeNardo_Programacion/BusquedaCSV/archivo.csv"))) {
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
