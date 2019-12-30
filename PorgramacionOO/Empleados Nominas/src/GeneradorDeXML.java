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
import java.util.ArrayList;
import java.util.Iterator;

public class GeneradorDeXML {

        public GeneradorDeXML(){
        }

        public void crearXMLActividadesEmpleado(Empleado EmpleadoACalcular){
                try{
                        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                        DocumentBuilder db = dbf.newDocumentBuilder();
                        Document doc = db.newDocument();

                        Element root = doc.createElement ("Actividades");
                        doc.appendChild(root);


                        Iterator<Actividad> it = EmpleadoACalcular.getActividadesDelEmpleado().iterator();
                        while (it.hasNext()){
                                Actividad Actividad = it.next();
                                Element NodoActividad = doc.createElement("Actividad");

                                Attr NodoHorasDeLaActividad = doc.createAttribute("Horas");
                                NodoHorasDeLaActividad.setValue(Double.toString(Actividad.getNumHoras()));
                                System.out.println(Actividad.getNumHoras());

                                Attr NodoNombreProyecto = doc.createAttribute("NombreProyecto");
                                NodoNombreProyecto.setValue(Actividad.getProyecto().getNombre());
                                System.out.println(Actividad.getProyecto().getNombre());

                                Attr NodoDescripcionActividad = doc.createAttribute("DescripcionActividad");
                                NodoDescripcionActividad.setValue(Actividad.getDescripcion());
                                System.out.println(Actividad.getDescripcion());

                                NodoActividad.setAttributeNode(NodoHorasDeLaActividad);
                                NodoActividad.setAttributeNode(NodoNombreProyecto);
                                NodoActividad.setAttributeNode(NodoDescripcionActividad);

                                root.appendChild(NodoActividad);
                        }
                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();
                        DOMSource source = new DOMSource(doc);
                        StreamResult result = new StreamResult(new File(EmpleadoACalcular.getDNI() + ".xml"));
                        transformer.setOutputProperty(OutputKeys.INDENT,"yes");
                        transformer.transform(source,result);
                } catch (ParserConfigurationException | TransformerConfigurationException e) {
                        e.printStackTrace();
                } catch (TransformerException e) {
                        e.printStackTrace();
                }

        }

        public void crearXMLActividadesDeProyecto(Proyecto ProyectoABuscar, ArrayList<Empleado> ListadeBusquedaDeActividades){
                ArrayList<Actividad> actividadesDelProyectoBuscado = new ArrayList<>();
                for (int i = 0; i < ListadeBusquedaDeActividades.size(); i++){
                        Empleado empleadoqueItera = ListadeBusquedaDeActividades.get(i);
                        for (int in = 0; in < empleadoqueItera.getActividadesDelEmpleado().size(); in++ ){
                                if (empleadoqueItera.getActividadesDelEmpleado().get(in).getProyecto().getNombre().equals(ProyectoABuscar.getNombre())){
                                        actividadesDelProyectoBuscado.add(empleadoqueItera.getActividadesDelEmpleado().get(in));
                                }
                        }
                }
                try{
                        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                        DocumentBuilder db = dbf.newDocumentBuilder();
                        Document doc = db.newDocument();

                        Element root = doc.createElement ("ActividadesProyecto");
                        doc.appendChild(root);


                        Iterator<Actividad> it = actividadesDelProyectoBuscado.iterator();
                        while (it.hasNext()){
                                Actividad Actividad = it.next();
                                Element NodoActividad = doc.createElement("Actividad");

                                Attr NodoHorasDeLaActividad = doc.createAttribute("Horas");
                                NodoHorasDeLaActividad.setValue(Double.toString(Actividad.getNumHoras()));


                                Attr NodoNombreProyecto = doc.createAttribute("NombreProyecto");
                                NodoNombreProyecto.setValue(Actividad.getProyecto().getNombre());


                                Attr NodoDescripcionActividad = doc.createAttribute("DescripcionActividad");
                                NodoDescripcionActividad.setValue(Actividad.getDescripcion());


                                NodoActividad.setAttributeNode(NodoHorasDeLaActividad);
                                NodoActividad.setAttributeNode(NodoNombreProyecto);
                                NodoActividad.setAttributeNode(NodoDescripcionActividad);

                                root.appendChild(NodoActividad);
                        }
                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();
                        DOMSource source = new DOMSource(doc);
                        StreamResult result = new StreamResult(new File(ProyectoABuscar.getNombre() + ".xml"));
                        transformer.setOutputProperty(OutputKeys.INDENT,"yes");
                        transformer.transform(source,result);
                } catch (ParserConfigurationException | TransformerConfigurationException e) {
                        e.printStackTrace();
                } catch (TransformerException e) {
                        e.printStackTrace();
                }

        }

        public void crearXMLNominaEmpleado(ArrayList<Empleado> ListaParaCalcularNominas){
            try{
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.newDocument();

                Element root = doc.createElement ("Empleados");
                doc.appendChild(root);


                Iterator<Empleado> it = ListaParaCalcularNominas.iterator();
                while (it.hasNext()){
                    Empleado empleado = it.next();
                    Element NodoNominaEmpleado = doc.createElement("Empleado");

                    Attr NodoNombre = doc.createAttribute("Nombre");
                    NodoNombre.setValue(empleado.getNombre());


                    Attr NodoApellido = doc.createAttribute("Apellidos");
                    NodoApellido.setValue(empleado.getApellidos());


                    Attr NodoDNI = doc.createAttribute("DNI");
                    NodoDNI.setValue(empleado.getDNI());

                    Attr NodoCategoria = doc.createAttribute("Categoria");
                    NodoCategoria.setValue(empleado.getCategoria());

                    Attr NodoSueldoBase = doc.createAttribute("SueldoBase");
                    NodoSueldoBase.setValue(Integer.toString(empleado.getSueldo()));

                    Attr NodoProductividad = doc.createAttribute("Productividad");
                    NodoProductividad.setValue(Double.toString(empleado.getProductividad()));

                    Attr NodoSueldotTotal = doc.createAttribute("SueldoTotal");
                    NodoSueldotTotal.setValue(Double.toString(empleado.getSueldo() + empleado.getProductividad()));




                    NodoNominaEmpleado.setAttributeNode(NodoNombre);
                    NodoNominaEmpleado.setAttributeNode(NodoApellido);
                    NodoNominaEmpleado.setAttributeNode(NodoCategoria);
                    NodoNominaEmpleado.setAttributeNode(NodoSueldoBase);
                    NodoNominaEmpleado.setAttributeNode(NodoProductividad);
                    NodoNominaEmpleado.setAttributeNode(NodoSueldotTotal);

                    root.appendChild(NodoNominaEmpleado);
                }
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("NominasEmpleados.xml"));
                transformer.setOutputProperty(OutputKeys.INDENT,"yes");
                transformer.transform(source,result);
            } catch (ParserConfigurationException | TransformerConfigurationException e) {
                e.printStackTrace();
            } catch (TransformerException e) {
                e.printStackTrace();
            }
        }

}

