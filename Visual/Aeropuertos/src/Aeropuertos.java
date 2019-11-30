import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;

public class Aeropuertos {
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JPanel MainPanel;
    ArrayList<Aeropuerto> lista = new ArrayList<>();
    ArrayList<String> paises = new ArrayList<>();


    public Aeropuertos(){
        cargarXML();
        cargarCombo();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarAeropuerto();
            }
        });
    }

    public void buscarAeropuerto(){
        String paisCombo =comboBox1.getSelectedItem().toString();
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getPais().equals(paisCombo)){
                textArea1.append(lista.get(i).toString() + "\n");
            }
        }
    }

    public void cargarXML(){
        File file = new File("aeropuertos.xml");
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("aeropuerto");
            for (int i = 0; i < nList.getLength(); i++){
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;

                    lista.add(new Aeropuerto(eElement.getAttribute("area"),eElement.getAttribute("lat"),eElement.getAttribute("lon"),eElement.getAttribute("matricula"), eElement.getAttribute("nombreCorto"),eElement.getAttribute("nombreLargo"),eElement.getAttribute("pais")));



                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void cargarCombo(){
        Iterator<Aeropuerto> it = lista.iterator();
        while (it.hasNext()){
            paises.add(it.next().getPais());
        }
        Set<String> set = new HashSet<>();
        set.addAll(paises);
        paises.clear();
        paises.addAll(set);
        for (int i = 0; i < paises.size(); i++){
            comboBox1.addItem(paises.get(i));
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aeropuertos");
        frame.setContentPane(new Aeropuertos().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
