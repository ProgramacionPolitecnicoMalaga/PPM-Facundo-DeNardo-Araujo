import org.w3c.dom.Attr;
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

public class XMLGeneratorAtr extends XMLGenerator {
    @Override
    public void generar(String nombreArchivo, List<Empleado> empleados) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement ("empleados");
            doc.appendChild(root);


            Iterator<Empleado> it = empleados.iterator();
            while (it.hasNext()){
                Empleado empleado = it.next();
                Element Nodoempleado = doc.createElement("empleado");

                Attr Nodonombreempleado = doc.createAttribute("nombre");
                Nodonombreempleado.setValue(empleado.getNombre());

                Attr NodoemepleadoDNI = doc.createAttribute("dni");
                NodoemepleadoDNI.setValue(empleado.getDni());


                Nodoempleado.setAttributeNode(Nodonombreempleado);
                Nodoempleado.setAttributeNode(NodoemepleadoDNI);

                root.appendChild(Nodoempleado);
            }


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(nombreArchivo));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.transform(source,result);

        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }
}
