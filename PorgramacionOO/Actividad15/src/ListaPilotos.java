import java.io.*;
import java.util.*;

public class ListaPilotos {
    ArrayList<Pilotos> lista;
    public ListaPilotos() {
        lista = new ArrayList<>();
    }

    public void cargarLista(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("pilotos.csv"));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split(";");
                lista.add(new Pilotos(Integer.parseInt(fields[0]),fields[1],fields[2]));
                line = br.readLine();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void mostrarLista(){
        Iterator<Pilotos> it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void añadirPiloto(Pilotos piloto, int posicionSalida){
        lista.add(posicionSalida - 1 ,piloto);
    }

    public void obtenerPilotoEnPocision(int posicion){
        System.out.println(lista.get(posicion - 1));
    }

    public void setearPos(){
        for (int i = 0; i<lista.size(); i ++){
            lista.get(i).setPosicionDeSalida(i + 1);
        }
    }

    public void moverPiloto(String piloto, int a_posicion){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getNombre().equals(piloto)){
                Pilotos pilotoMover = new Pilotos(a_posicion,lista.get(i).getNombre(),lista.get(i).getEscuderia());
                lista.remove(lista.get(i));
                lista.add(a_posicion - 1, pilotoMover);
                setearPos();
            }
        }
    }

    public void descalificarPiloto( String nombrePiloto){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getNombre().equals(nombrePiloto)){
                lista.remove(i).setDescalificado();
                setearPos();
            }
        }
    }
    public void eliminarPilotosDescalificados(){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).isDescalificado() == true){
                lista.remove(i);
                setearPos();
            }
        }
    }

    public void ordenarPilotosPorPosicionDeSalida(){
        Collections.sort(lista);
    }
    public void ordenarPilotosPorNombres(){
        Collections.sort(lista);
    }


}
