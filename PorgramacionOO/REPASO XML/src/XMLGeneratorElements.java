import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class XMLGeneratorElements extends XMLGenerator {
    @Override
    public  void generar(String nombreArchivo, List<Empleado> empleados) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            //CREA LA RAIZ DEL XML
            Element root = doc.createElement ("empleados");
            doc.appendChild(root);

            // RECORRE LA LISTA DE EMPLEADOS PARA GENERAR LOS NODOS.
            Iterator<Empleado> it = empleados.iterator();
            while (it.hasNext()){
            Empleado empleado = it.next();

            //CREA NODO DE TIPO EMPLEADO, HIJO DE EMPLEADOS
            Element Nodoempleado = doc.createElement("empleado");

            // SE CREAN LOS NODOS HIJOS DE EMPLEADO, NOMBRE Y DNI
            Element Nodonombreempleado = doc.createElement("nombre");
            Nodonombreempleado.setTextContent(empleado.getNombre());

            Element NodoemepleadoDNI = doc.createElement("dni");
            NodoemepleadoDNI.setTextContent(empleado.getDni());

            // ENGANCHAMOS LOS NODOS HIJOS A EMPLEADO
            Nodoempleado.appendChild(Nodonombreempleado);
            Nodoempleado.appendChild(NodoemepleadoDNI);

            //ENGANCHAMOS EL NODO EMPLEADO(CON SUS HIJOS) A LA RAIZ EMPLEADOS
            root.appendChild(Nodoempleado);
            }


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(nombreArchivo));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes"); //PONE INDENTACION AL CREAR EL XML
            transformer.transform(source,result);

        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
