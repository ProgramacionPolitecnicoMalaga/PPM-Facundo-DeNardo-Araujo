import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.*;

public class Asignatura implements GeneradorXML{
    private String id;
    private String nombre;
    private HashMap<Alumno,ArrayList<Indicador>> AlumnosIndicadores;
    private ArrayList<Indicador> IndicadoresDeLaAsignatura;


    public Asignatura(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        IndicadoresDeLaAsignatura = new ArrayList<Indicador>();
        AlumnosIndicadores = new HashMap<Alumno,ArrayList<Indicador>>();
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void matricularAlumno(Alumno Alumno){
        ArrayList<Indicador> indicadoresDelAlumno = new ArrayList<Indicador>();
        for (int i = 0; i < IndicadoresDeLaAsignatura.size(); i++){
            indicadoresDelAlumno.add(new Indicador(IndicadoresDeLaAsignatura.get(i).getTipo(),IndicadoresDeLaAsignatura.get(i).getNombre()));
        }
        AlumnosIndicadores.put(Alumno,indicadoresDelAlumno);
    }

    public void añadirIndicador(Indicador indicador){
        IndicadoresDeLaAsignatura.add(indicador);
        Set<Indicador> hs = new HashSet<>();
        hs.addAll(IndicadoresDeLaAsignatura);
        IndicadoresDeLaAsignatura.clear();
        IndicadoresDeLaAsignatura.addAll(hs);
    }

    public void mostrarIndAsign(){
        System.out.println(IndicadoresDeLaAsignatura);
    }

    public void añadirIndicardorDeUnAlumno(Alumno alumno, Indicador indicador,double nota, String descripcion){
        for (Map.Entry<Alumno,ArrayList<Indicador>> entry : AlumnosIndicadores.entrySet()){
            if (entry.getKey().equals(alumno)){
                for (int i = 0; i < entry.getValue().size(); i++){
                    if (entry.getValue().get(i).equals(indicador)){
                        entry.getValue().get(i).setNota(nota);
                        entry.getValue().get(i).setDescripcion(descripcion);
                    }
                }
            }
        }
    }

    public void mostrarAlumnosMatriculados() {
        for (Map.Entry<Alumno, ArrayList<Indicador>> entry : AlumnosIndicadores.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public void mostrarNotasAlumno(Alumno alumno){
        for (Map.Entry<Alumno,ArrayList<Indicador>> entry : AlumnosIndicadores.entrySet()){
            if (entry.getKey().equals(alumno)){
                System.out.println(entry);
            }
        }
    }

    public void mostrarNotasTodosAlumnos(){
        for (Map.Entry<Alumno,ArrayList<Indicador>> entry : AlumnosIndicadores.entrySet()){
            System.out.println(entry);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Alumno, ArrayList<Indicador>> getAlumnosIndicadores() {
        return AlumnosIndicadores;
    }

    public void setAlumnosIndicadores(HashMap<Alumno, ArrayList<Indicador>> alumnosIndicadores) {
        this.AlumnosIndicadores = alumnosIndicadores;
    }

    @Override
    public void GenerarXML() {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement ("Asignatura");
            doc.appendChild(root);



            for (Map.Entry<Alumno, ArrayList<Indicador>> entry : AlumnosIndicadores.entrySet()){
                Alumno alumno = entry.getKey();

                Element NodoAlumno = doc.createElement("Alumno");

                Attr NodoNombreAlumno = doc.createAttribute("NombreAlumno");
                NodoNombreAlumno.setValue(alumno.getNombreAlumno());

                NodoAlumno.setAttributeNode(NodoNombreAlumno);

                root.appendChild(NodoAlumno);

                ArrayList<Indicador> listaIndAlmno = entry.getValue();
                Iterator<Indicador> iti = listaIndAlmno.iterator();
                while (iti.hasNext()){
                    Indicador indicador = iti.next();

                    Element NodoIndicador = doc.createElement("Indicador");

                    Attr NodoTipo = doc.createAttribute("Tipo");
                    NodoTipo.setValue(indicador.getTipo());

                    Attr NodoNombre = doc.createAttribute("Nombre");
                    NodoNombre.setValue(indicador.getNombre());

                    Attr NodoNota = doc.createAttribute("Nota");
                    NodoNota.setValue(Double.toString(indicador.getNota()));

                    NodoIndicador.setAttributeNode(NodoTipo);
                    NodoIndicador.setAttributeNode(NodoNombre);
                    NodoIndicador.setAttributeNode(NodoNota);

                    NodoAlumno.appendChild(NodoIndicador);

                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(this.nombre + ".xml"));
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

            NodeList nList = doc.getElementsByTagName("Alumno");
            NodeList nList2 = doc.getElementsByTagName("Indicador");
            for (int i = 0; i < nList.getLength(); i++){
                Node nNode = nList.item(i);
                Node nNode2 = nList2.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    Element element2 = (Element) nNode2;

                    Alumno alumno = new Alumno(eElement.getAttribute("NombreAlumno"));
                    Indicador indicador = new Indicador(element2.getAttribute("Tipo"),element2.getAttribute("Nombre"));
                    matricularAlumno(alumno);
                    añadirIndicador(indicador);
                    añadirIndicardorDeUnAlumno(alumno,indicador,Double.parseDouble(element2.getAttribute("Nota")),"Descripcion generica para todos");
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
