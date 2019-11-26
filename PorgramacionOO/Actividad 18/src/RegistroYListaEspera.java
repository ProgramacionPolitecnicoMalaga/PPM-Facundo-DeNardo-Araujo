import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class RegistroYListaEspera {
    private JPanel panel1;
    private JTextArea textArea1;
    private JTextField NombrePaciente;
    private JTextField edadPaciente;
    private JComboBox comboUrgencia;
    private JTextField incidenciaGravedad;
    private JButton REGISTRARButton;
    private JButton SIGUIENTEPACIENTEButton;
    private JTextField textField4;
    PriorityQueue<Paciente> listaDeEspera = new PriorityQueue<Paciente>(Paciente.COMPARADOR_PRIORIDAD);
    LinkedList<TipoDeUrgencia> lista = new LinkedList<TipoDeUrgencia>();

    public RegistroYListaEspera() {
        cargarUrgencias();
        cargarUrgenciasEnComboBox();
        REGISTRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(null);
                TipoDeUrgencia t = (TipoDeUrgencia) comboUrgencia.getSelectedItem();
                listaDeEspera.add(new Paciente(NombrePaciente.getText(),Integer.parseInt(edadPaciente.getText()),t.getEspecialidad(),t.getIncidenciaDeGravedad()));
                mostrarListaEspera();
                textField4.setText(listaDeEspera.peek().getNombre());
            }
        });
        comboUrgencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TipoDeUrgencia t = (TipoDeUrgencia) comboUrgencia.getSelectedItem();
                incidenciaGravedad.setText(Integer.toString(t.getIncidenciaDeGravedad()));
            }
        });
        SIGUIENTEPACIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(null);
                try {
                    listaDeEspera.remove();
                    textField4.setText(listaDeEspera.peek().toString());
                    mostrarListaEspera();
                }catch (NullPointerException e1){
                    textArea1.setText(null);
                    textArea1.setText("No quedan pacientes");
                }catch (NoSuchElementException e2){}
            }
        });
    }

    public void mostrarListaEspera(){
        Iterator<Paciente> it = listaDeEspera.iterator();
        while (it.hasNext()){
            textArea1.append(it.next().toString() + "\n");
        }
    }

    public void cargarUrgencias(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("TiposDeUrgencia.csv"));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split(";");
                lista.add(new TipoDeUrgencia(Integer.parseInt(fields[0]),fields[1]));
                line = br.readLine();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void cargarUrgenciasEnComboBox(){
        Iterator<TipoDeUrgencia> it = lista.iterator();
        while(it.hasNext()){
            comboUrgencia.addItem(it.next());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro y Lista de Espera");
        frame.setContentPane(new RegistroYListaEspera().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
