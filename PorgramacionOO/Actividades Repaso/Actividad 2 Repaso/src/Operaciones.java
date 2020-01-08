import java.util.ArrayList;

public class Operaciones {
    ArrayList<Comercial> coincidencias;

    public Operaciones(){
        coincidencias = new ArrayList<>();
    }

    public void buscarNventas(Comerciales lista, int numVenta){
        Comercial com = null;
        for (int i = 0; i < lista.getComList().size(); i++) {
            com = lista.getComList().get(i);
            for (int j = 0; j < com.getVentas().size(); j++)
                if (com.getVentas().get(j) == numVenta)
                    coincidencias.add(com);
        }
        System.out.println("Los empleados con esas ventas son: " + coincidencias);
    }
}
