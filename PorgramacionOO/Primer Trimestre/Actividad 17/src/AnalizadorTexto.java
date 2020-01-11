import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class AnalizadorTexto {

    HashSet<Palabra> lista = new HashSet<>();

    public AnalizadorTexto(){

    }

    public void analizartexto(String nombreDocumento){
        try{
            BufferedReader br = new BufferedReader(new FileReader(nombreDocumento));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split("[ ,.;]+");
                line = br.readLine();
                for (int i = 0 ; i < fields.length; i ++){
                    lista.add(new Palabra(fields[i], i));
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mostrarPalabrasFiltradas(){
        Iterator<Palabra> it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getNombreDePalabra());
            }
        }
    }

