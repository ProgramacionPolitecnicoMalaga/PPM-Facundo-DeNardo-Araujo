import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;


public class Cursos implements GeneradorXML {

    ArrayList<Curso> listaDeCursos;

    public Cursos() {
        listaDeCursos = new ArrayList<Curso>();
    }

    public void addCurso(Curso curso){
        listaDeCursos.add(curso);
    }

    public ArrayList<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    @Override
    public  void GenerarXML() {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement ("Cursos");
            doc.appendChild(root);


            Iterator<Curso> it = listaDeCursos.iterator();
            while (it.hasNext()){
                Curso curso = it.next();
                Element NodoCurso = doc.createElement("Curso");

                Attr NodoID = doc.createAttribute("ID");
                NodoID.setValue(curso.getId());
                Attr NodoNombre = doc.createAttribute("NombreCurso");
                NodoNombre.setValue(curso.getNombre());

                NodoCurso.setAttributeNode(NodoID);
                NodoCurso.setAttributeNode(NodoNombre);

                root.appendChild(NodoCurso);

                Iterator<Asignatura> itA = curso.getListaAsignaturas().iterator();
                while (itA.hasNext()){
                    Asignatura asignatura = itA.next();
                    Element NodoAsignatura = doc.createElement("Asignatura");

                    Attr NodoId = doc.createAttribute("ID");
                    NodoId.setValue(asignatura.getId());

                    Attr Nodonombre = doc.createAttribute("NombreAsignatura");
                    Nodonombre.setValue(asignatura.getNombre());


                    NodoAsignatura.setAttributeNode(NodoId);
                    NodoAsignatura.setAttributeNode(Nodonombre);

                    NodoCurso.appendChild(NodoAsignatura);
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("cursos.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.transform(source,result);
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void LeerXML(String nombreArchivo) {

            File file = new File(nombreArchivo);
            try {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(file);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("Curso");
                for (int i = 0; i < nList.getLength(); i++){
                    Node nNode = nList.item(i);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE){
                        Element eElement = (Element) nNode;

                        Curso curso = new Curso(eElement.getAttribute("ID"),eElement.getAttribute("NombreCurso"));
                        listaDeCursos.add(curso);
                        NodeList nList2 = doc.getElementsByTagName("Asignatura");
                            for (int i2 = 0; i2 < nList2.getLength(); i2++ ){
                                Node nNode2 = nList2.item(i2);
                                if (nNode2.getNodeType() == Node.ELEMENT_NODE){
                                    Element element2 = (Element) nNode2;

                                    Asignatura asignatura = new Asignatura(element2.getAttribute("ID"), element2.getAttribute("NombreAsignatura"));
                                    curso.añadirAsignatura(asignatura);
                                }
                            }
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
    }


}
