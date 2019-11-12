import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class MiMain {
    public static void main(String[] args) {
        ArrayList<Invitados> lista = new ArrayList<>();


        Iterator<Invitados> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

            Date edad = new Date();
            System.out.println(edad.toString());
        }
    }
}

/*
Mnaejo de fechas

DateTimeFormatter formatoTiempo = DateTimeFormatter.ofPattern("dd/mm/yyyy");

 */