import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class XMLMannager {
    Document doc;

    public XMLMannager(){}

    public void XMLAeropuertosPaises(Paises paises, Airports airports){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            //CREA LA RAIZ DEL XML
            Element root = doc.createElement ("Aeropuertos");
            doc.appendChild(root);

            // RECORRE LA LISTA DE PAISES PARA GENERAR LOS NODOS.
            for (int j = 0; j < paises.getListaPaises().size(); j++){
                Element NodoPais = doc.createElement("Pais");

                Attr NombrePais = doc.createAttribute("name");
                NombrePais.setValue(paises.getListaPaises().get(j).getNombre());

                for (int i = 0; i < airports.getAirportsLists().size(); i++){
                    if (airports.getAirportsLists().get(i).getPais().equals(paises.getListaPaises().get(j))){
                        Element NodoAirport = doc.createElement("aeropuerto");

                        Element NodoNombreAirport = doc.createElement("nombre");
                        NodoNombreAirport.setTextContent(airports.getAirportsLists().get(i).getNombre());

                        Element NodoIata = doc.createElement("iata");
                        NodoIata.setTextContent(airports.getAirportsLists().get(i).getIata());

                        Element NodoLocation = doc.createElement("localizacion");

                        Element NodoCiudad = doc.createElement("ciudad");
                        NodoCiudad.setTextContent(airports.getAirportsLists().get(i).getCiudad());

                        Element Nodolat = doc.createElement("latitud");
                        Nodolat.setTextContent(airports.getAirportsLists().get(i).getLatitud());

                        Element NodoLon = doc.createElement("longitud");
                        NodoLon.setTextContent(airports.getAirportsLists().get(i).getLongitud());

                    NodoPais.appendChild(NodoAirport);
                    NodoAirport.appendChild(NodoNombreAirport);
                    NodoAirport.appendChild(NodoIata);
                    NodoAirport.appendChild(NodoLocation);
                    NodoLocation.appendChild(NodoCiudad);
                    NodoLocation.appendChild(Nodolat);
                    NodoLocation.appendChild(NodoLon);
                    }
                }
                NodoPais.setAttributeNode(NombrePais);
                root.appendChild(NodoPais);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("airports.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.transform(source,result);

        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public void XMLPaisesAerolineas(Paises paises, Airlines airlines){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            //CREA LA RAIZ DEL XML
            Element root = doc.createElement ("Aeropuertos");
            doc.appendChild(root);

            // RECORRE LA LISTA DE PAISES PARA GENERAR LOS NODOS.
            for (int j = 0; j < paises.getListaPaises().size(); j++){
                Element NodoPais = doc.createElement("Pais");

                Attr NombrePais = doc.createAttribute("name");
                NombrePais.setValue(paises.getListaPaises().get(j).getNombre());

                for (int i = 0; i < airlines.getAerolineas().size(); i++){
                    if (airlines.getAerolineas().get(i).getPais().equals(paises.getListaPaises().get(j))){
                        Element NodoAirline = doc.createElement("aerolinea");

                        Attr NodoId = doc.createAttribute("id");
                        NodoId.setValue(airlines.getAerolineas().get(i).getId());

                        Element NodoNombreAirline = doc.createElement("nombre");
                        NodoNombreAirline.setTextContent(airlines.getAerolineas().get(i).getNombre());

                        Element NodoIata = doc.createElement("iata");
                        NodoIata.setTextContent(airlines.getAerolineas().get(i).getIata());

                        Element NodoCodLam = doc.createElement("codigoLlamada");
                        NodoCodLam.setTextContent(airlines.getAerolineas().get(i).getCodigoLlamada());



                        NodoPais.appendChild(NodoAirline);
                        NodoAirline.setAttributeNode(NodoId);
                        NodoAirline.appendChild(NodoNombreAirline);
                        NodoAirline.appendChild(NodoIata);
                        NodoAirline.appendChild(NodoCodLam);
                    }
                }
                NodoPais.setAttributeNode(NombrePais);
                root.appendChild(NodoPais);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("airlines.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.transform(source,result);

        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public void XMLaCSVAirlines(String nombreArchivo) {
        abrir(nombreArchivo);
        ArrayList<String> aerolineas = new ArrayList<>();
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            String xpathExpr = "/Aeropuertos/Pais";
            NodeList nodosPais = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
            for (int i=0; i<nodosPais.getLength();i++){

                Element elementoPais = (Element) nodosPais.item(i);
                String namePais = elementoPais.getAttribute("name");


                NodeList nodoAerolinea = elementoPais.getElementsByTagName("aerolinea");
                for (int j = 0; j < nodoAerolinea.getLength(); j++){
                    Element elementIdAerolinea = (Element) nodoAerolinea.item(j);
                    String idAer = elementIdAerolinea.getAttribute("id");
                    String nombre = elementIdAerolinea.getElementsByTagName("nombre").item(0).getTextContent();
                    String iata = elementIdAerolinea.getElementsByTagName("iata").item(0).getTextContent();
                    String codigoLlamada = elementIdAerolinea.getElementsByTagName("codigoLlamada").item(0).getTextContent();
                    aerolineas.add(namePais + "," + idAer + "," + nombre + "," + iata + "," + codigoLlamada);

                    FileWriter fichero = null;
                    try {
                        fichero = new FileWriter("aerolineas.csv");
                        for (String linea : aerolineas) {
                            fichero.write(linea + "\n");
                        }
                        fichero.close();
                    } catch (Exception ex) {
                        System.out.println("Mensaje de la excepción: " + ex.getMessage());
                    }
                }
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

    public void XMLaCSVAirports(String nombreArchivo){
        abrir(nombreArchivo);
        ArrayList<String> aerolineas = new ArrayList<>();
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            String xpathExpr = "/Aeropuertos/Pais";
            NodeList nodosPais = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
            for (int i=0; i<nodosPais.getLength();i++){

                Element elementoPais = (Element) nodosPais.item(i);
                String namePais = elementoPais.getAttribute("name");


                NodeList nodoAeropuerto = elementoPais.getElementsByTagName("aeropuerto");
                for (int j = 0; j < nodoAeropuerto.getLength(); j++){
                    Element elementIdAeropuerto = (Element) nodoAeropuerto.item(j);
                    String nombre = elementIdAeropuerto.getElementsByTagName("nombre").item(0).getTextContent();
                    String iata = elementIdAeropuerto.getElementsByTagName("iata").item(0).getTextContent();

                    NodeList nodoLocalizacion = elementIdAeropuerto.getElementsByTagName("localizacion");
                    for (int k = 0 ; k < nodoLocalizacion.getLength(); k++){
                        Element elementoLoc = (Element) nodoLocalizacion.item(k);
                        String ciudad = elementoLoc.getElementsByTagName("ciudad").item(0).getTextContent();
                        String lat = elementoLoc.getElementsByTagName("latitud").item(0).getTextContent();
                        String lon = elementoLoc.getElementsByTagName("longitud").item(0).getTextContent();


                        aerolineas.add(namePais + "," + nombre + "," + iata + "," + ciudad + "," + lat + "," + lon);
                    }


                    FileWriter fichero = null;
                    try {
                        fichero = new FileWriter("aeropuertos.csv");
                        for (String linea : aerolineas) {
                            fichero.write(linea + "\n");
                        }
                        fichero.close();
                    } catch (Exception ex) {
                        System.out.println("Mensaje de la excepción: " + ex.getMessage());
                    }
                }
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

    public void abrir(String nombreArchivo) {
        try {
            File inputFile = new File(nombreArchivo);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
