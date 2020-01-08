import java.io.*;
import java.util.*;

public class ListaPilotos{
    private int numeroDeVecesWhile = 0;
    ArrayList<Pilotos> lista;
    Random r = new Random();
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



    public void moverPiloto(String piloto, int a_posicion){ // pasar piloto en lugar de string
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getNombre().equals(piloto)){
                Pilotos pilotoMover = new Pilotos(a_posicion,lista.get(i).getNombre(),lista.get(i).getEscuderia());
                lista.remove(lista.get(i));
                lista.add(a_posicion - 1, pilotoMover);
            }
        }
    }
    public void setearPos(){
        for (int i = 0; i < lista.size(); i++){
            lista.get(i).setPosicionDeSalida(i + 1);
        }
    }
    public void adelantarPilotoAleatorio(){
        int pilotoamover = r.nextInt(lista.size()) + 1;
        if (pilotoamover == 0){
            pilotoamover = pilotoamover + 1;
        }
        System.out.println(pilotoamover);
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getPosicionDeSalida() == pilotoamover) {
                if (pilotoamover > 2) {
                    int posicionAmover = lista.get(i).getPosicionDeSalida() - 2;
                    Pilotos pilotoMover = new Pilotos(posicionAmover, lista.get(i).getNombre(), lista.get(i).getEscuderia());
                    lista.remove(i);
                    lista.add(posicionAmover - 1, pilotoMover);
                    setearPos();

                }if (pilotoamover == 2){
                    int posicionAmover = lista.get(i).getPosicionDeSalida() -1;
                    Pilotos pilotoMover = new Pilotos(posicionAmover, lista.get(i).getNombre(), lista.get(i).getEscuderia());
                    lista.remove(i);
                    lista.add(posicionAmover - 1, pilotoMover);
                    setearPos();

                }
            }
        }
    }
    public void atrasarPilotoAleatorio(){
        int pilotoamover = r.nextInt(lista.size()) + 1;
        if (pilotoamover == 0){
            pilotoamover = pilotoamover + 1;
        }
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getPosicionDeSalida() == pilotoamover) {
                if (pilotoamover < 19){
                int posicionAmover = lista.get(i).getPosicionDeSalida() + 2;
                Pilotos pilotoMover = new Pilotos(posicionAmover, lista.get(i).getNombre(), lista.get(i).getEscuderia());
                lista.remove(i);
                lista.add(posicionAmover - 1, pilotoMover);
                setearPos();
            }if (pilotoamover == 19){
                    int posicionAmover = lista.get(i).getPosicionDeSalida() + 1;
                    Pilotos pilotoMover = new Pilotos(posicionAmover, lista.get(i).getNombre(), lista.get(i).getEscuderia());
                    lista.remove(i);
                    lista.add(posicionAmover - 1, pilotoMover);
                    setearPos();
                }
            }
        }
    }

    public void runLap(){
        while (numeroDeVecesWhile !=7){
            numeroDeVecesWhile++;
            System.out.println(numeroDeVecesWhile);
        }
    }

    public void adelantarPiloto(String piloto){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getNombre().equals(piloto)) {
                    int posicionAmover = lista.get(i).getPosicionDeSalida() - 2;
                    Pilotos pilotoMover = new Pilotos(posicionAmover, lista.get(i).getNombre(), lista.get(i).getEscuderia());
                    lista.remove(i);
                    lista.add(posicionAmover - 1, pilotoMover);

            }
        }
    }

    public void descalificarPiloto( String nombrePiloto){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getNombre().equals(nombrePiloto)){
                lista.remove(i).setDescalificado();
            }
        }
    }
    public void eliminarPilotosDescalificados(){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).isDescalificado() == true){
                lista.remove(i);
            }
        }
    }
}
