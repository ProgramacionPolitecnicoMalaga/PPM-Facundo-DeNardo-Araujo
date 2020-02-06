import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class Aditivos {
    private JPanel panel1;
    private JTextArea TextAreaDescripcion;
    private JButton button1;
    private JTextField textField1;
    private JList<Aditivo> list1;
    private JTextField textField2;
    private JTextField textField3;
    ArrayList<Aditivo> lista = new ArrayList<>();
    DefaultListModel listModel = new DefaultListModel();
    JsonArray array;
    Gson gson;


    public Aditivos() {
        cargarAditivosFromJson();
        list1.setModel(listModel);
        TextAreaDescripcion.setLineWrap(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarAditivo();
            }
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = list1.getSelectedIndex();
                try {
                    Aditivo  aditivoSeleccionado = (Aditivo) listModel.getElementAt(index);
                    textField2.setText(aditivoSeleccionado.getNombre());
                    textField3.setText(aditivoSeleccionado.getPeligrosidad());
                    TextAreaDescripcion.setText(aditivoSeleccionado.getComentario());
                }catch (IndexOutOfBoundsException e1){}

            }
        });
    }

    public void buscarAditivo(){
        listModel.clear();
        String buscado = textField1.getText();
        try{
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).toString().contains(buscado)){
                listModel.addElement(gson.fromJson(array.get(i), Aditivo.class));
            }
        }}catch (IndexOutOfBoundsException e){}
    }

    public void cargarAditivosFromJson(){
        try {
            gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader("aditivos.json"));
            JsonParser parser = new JsonParser();
            array = parser.parse(br).getAsJsonArray();


            for (int i = 0; i < array.size(); i++) {
                lista.add(gson.fromJson(array.get(i), Aditivo.class));
            }
        }catch (FileNotFoundException e){
        }
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Aditivos");
        frame.setContentPane(new Aditivos().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
