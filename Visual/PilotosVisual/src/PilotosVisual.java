import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PilotosVisual {
    private JPanel MainPanel;
    private JButton INICIARButton;
    private JButton VUELTAButton;
    private JTextField textField1;
    private JLabel Vuelta;
    private JLabel GANADOR;
    private JTextField textField2;
    private JButton REINICIARButton;
    private JTextArea textArea1;
    private int numeroDeVecesWhile = 0;
    ArrayList<Pilotos> lista = new ArrayList<>();
    Random r = new Random();
    private int vueltas = 0;

    public PilotosVisual() {
        INICIARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                INICIARButton.setEnabled(false);
                VUELTAButton.setEnabled(true);
                cargarLista();
                mostrarLista();
            }
        });
        VUELTAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                INICIARButton.setEnabled(false);
                runLap();
                mostrarLista();
                mostrarGanadorYReiniciar();
            }
        });
        REINICIARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.clear();
                INICIARButton.setEnabled(true);
                numeroDeVecesWhile = 0;
                vueltas = 0;
                textArea1.setText(null);
                textField1.setText(null);
                textField2.setText(null);
            }
        });
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
        textArea1.setText(null);
        Iterator<Pilotos> it = lista.iterator();
        while (it.hasNext()){
            textArea1.append(it.next().toString() + "\n");
        }
    }

    public void runLap(){
        vueltas++;
        numeroDeVecesWhile = 0;
        textField1.setText(Integer.toString(vueltas));
        if (vueltas != 15){
        while (numeroDeVecesWhile != 7) {
            numeroDeVecesWhile++;
            if (numeroDeVecesWhile < 4) {
                adelantarPilotoAleatorio();
                 } else
                atrasarPilotoAleatorio();
            }
        }else
            VUELTAButton.setEnabled(false);
    }

    public void mostrarGanadorYReiniciar(){
        if (vueltas == 15){
            textField2.setText(lista.get(0).getNombre());
            REINICIARButton.setEnabled(true);
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

    public static void main(String[] args) {
        JFrame frame = new JFrame("Carrera F1");
        frame.setContentPane(new PilotosVisual().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
