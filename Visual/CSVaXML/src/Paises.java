import java.util.ArrayList;

public class Paises {
    ArrayList<Pais> listaPaises;

    public Paises(){
        listaPaises = new ArrayList<>();
    }

    public void addPais(Pais pais){
        listaPaises.add(pais);
    }

    @Override
    public String toString() {
        return "Paises{" +
                "listaPaises=" + listaPaises +
                '}';
    }

    public ArrayList<Pais> getListaPaises() {
        return listaPaises;
    }
}
