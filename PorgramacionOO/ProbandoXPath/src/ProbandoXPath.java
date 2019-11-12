import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;

public class ProbandoXPath {
    public static void main(String[] args) {
        XPathEvaluator eval = new XPathEvaluator("songlist.xml");

        try {
            NodeList nodeSet = eval.evaluateXPath("/listas/lista[@name='Lista de TripHop']/cancion");
            Element e = (Element) nodeSet.item(0);
            //aqui estoy obteniendo el primer elemento
            //Hay que saber de antes la estrucutura de nodeset, porque el xpath varía.
            //System.out.println(e.getAttribute("id"));
            /*NodeList canciones = e.getElementsByTagName("cancion");
            NodeList HijosDeCancion0 =  canciones.item(0).getChildNodes();
            for (int i = 0; i < HijosDeCancion0.getLength(); i++){
                System.out.println(HijosDeCancion0.item(i).getTextContent());
            }*/
            NodeList canciones = e.getChildNodes();

            for (int i = 0; i < canciones.getLength(); i++){
                Element cancion = (Element) canciones.item(i);
                System.out.println(cancion.getAttribute("id"));
            }


            /*
            for (int i=0; i<nodeSet.getLength();i++){
                if (nodeSet.item(i).getNodeType() == Element.ELEMENT_NODE){
                    Element elemento = (Element) nodeSet.item(i);
                    System.out.println("ELEMENTO:"+elemento.getNodeName());
                    System.out.println("ATRIBUTO ID:"+elemento.getAttribute("id"));
                    System.out.println("ATRIBUTO DURACIÓN:"+elemento.getAttribute("duracion"));
                    NodeList nodosHijos = elemento.getChildNodes();
                    for (int j=0; j< nodosHijos.getLength(); j++){
                        if (nodosHijos.item(j).getNodeType() == Element.TEXT_NODE)
                            System.out.println("CONTENIDO"+nodosHijos.item(j).getTextContent());
                    }
                }
            }*/

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

    }
}