import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Empleado> list = new ArrayList<>();

        list.add(new Empleado("pepe", "1234556"));
        list.add(new Empleado("jaun", "98765343"));
        list.add(new Empleado("luis", "4SDFSF556"));

        XMLGenerator xmlGeneratorPorNodos = new XMLGeneratorElements();
        xmlGeneratorPorNodos.generar("empleados.xml", list);


        XMLGenerator xmlGeneratorPorAttr = new XMLGeneratorAtr();
        xmlGeneratorPorAttr.generar("atributos.xml", list);
    }
}
