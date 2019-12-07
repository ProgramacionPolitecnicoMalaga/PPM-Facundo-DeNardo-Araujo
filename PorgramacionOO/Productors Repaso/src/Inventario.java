import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
    ArrayList<Componente> lista;

    public Inventario() {
        lista = new ArrayList<>();
    }

    public ArrayList<Componente> comprobarStock(Producto producto){
        ArrayList<Componente> componentesEscasos = new ArrayList<Componente>();
        Iterator<Componente> it = producto.getComponentesNecesarios().iterator();
        while (it.hasNext()){
            Componente especificacion = it.next();
            Iterator<Componente> itExistencias = lista.iterator();
            boolean encontrado = false;
            while ((itExistencias.hasNext()) && (!encontrado)){
                Componente existencia = itExistencias.next();
                if (existencia.equals(especificacion)){
                    if(existencia.getCantidad() -especificacion.getCantidad() * 10 < 0)
                        componentesEscasos.add(existencia);
                            encontrado = true;
                }
            }
        }
        return componentesEscasos;
    }

    public void add(Componente existencia, int cantidadInicia){
        //TODO COMPROBAR QUE NO EXISTE YA
    }

    public void reponer (String id, int cantidad){
        Iterator<Componente> itExistencia = lista.iterator();
        while   (itExistencia.hasNext()){
            Componente existencia = itExistencia.next();
            if (existencia.getId().equals(id)){
                existencia.setCantidad(existencia.getCantidad() + cantidad);
            }
        }
    }

    public void leerXML(String nombreDelArchivo) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        File file = new File(nombreDelArchivo);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();

        XPath xPath = XPathFactory.newInstance().newXPath();
        String xpathExpr = "/inventario/componente";
        NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);

        for (int i = 0; i< nodeList.getLength(); i++){
            Element elementoExistencia = (Element) nodeList.item(i);
            String id = elementoExistencia.getAttribute("id");
            int cantidad = Integer.parseInt(elementoExistencia.getAttribute("existencias"));
            lista.add(new Componente(id, cantidad));
        }
    }

    public void minimasExistencias(Producto producto){
    }

    public ArrayList<Componente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Componente> lista) {
        this.lista = lista;
    }
}
