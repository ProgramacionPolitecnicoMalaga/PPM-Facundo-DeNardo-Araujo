import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneradorXML {
    private Document doc;
    private String nombreArchivo;
    private String dir = System.getProperty("user.dir");


    public GeneradorXML(String nombreArchivo) {
        this.nombreArchivo=nombreArchivo;
    }

    public void abrir() {
        try {
            File inputFile = new File(nombreArchivo);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Vehiculo> cargar() {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        NodeList nList = doc.getElementsByTagName("vehiculo");
        for (int i = 0; i < nList.getLength(); i++) {
            Node nNode = nList.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                lista.add(new Vehiculo(eElement.getAttribute("marca"),eElement.getAttribute("modelo"),eElement.getAttribute("kilometros"),eElement.getAttribute("combustible"),eElement.getAttribute("precio")));
            }
        }
        return lista;
    }

}
