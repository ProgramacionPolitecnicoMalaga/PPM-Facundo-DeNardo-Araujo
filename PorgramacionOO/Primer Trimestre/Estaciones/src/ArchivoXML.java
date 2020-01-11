import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;

public class ArchivoXML {
    private Document doc;
    private String nombreArchivo;
    private String dir = System.getProperty("user.dir");

    public ArchivoXML(String nombreArchivo) {
        this.nombreArchivo=nombreArchivo;
    }

    public void abrir() {
        try {
            File inputFile = new File(dir + File.separator + nombreArchivo);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Ciudades leerCiudades() {
        Ciudades ciudades = new Ciudades();
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            String xpathExpr = "/rows/row";
            NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element elementoRow = (Element) nodeList.item(i);
                Element locality = (Element) elementoRow.getElementsByTagName("locality").item(0);
                Ciudad ciudad = new Ciudad(locality.getTextContent());
                ciudades.addCiudad(ciudad);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ciudades;
    }
}