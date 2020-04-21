package DAO;

import Modelo.PoblacionPorNacionalidad;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class LectorXML {

    public ArrayList cargarXML(){
        ArrayList<PoblacionPorNacionalidad> lista = new ArrayList<>();
        File file = new File("src/main/resources/poblacionPorNacionalidades.xml");
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("row");
            for (int i = 0; i < nList.getLength(); i++){
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    lista.add(new PoblacionPorNacionalidad(eElement.getAttribute("Año"), eElement.getAttribute("Nacionalidad"), eElement.getAttribute("Número_de_empadronados")));
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
