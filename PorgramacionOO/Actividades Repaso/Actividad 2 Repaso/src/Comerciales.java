import java.util.ArrayList;

public class Comerciales {
    ArrayList<Comercial> comercialArrayList;

    public Comerciales(){
        comercialArrayList = new ArrayList<>();
    }

    public void RegistrarComercial(Comercial comercial){
        comercialArrayList.add(comercial);
    }

    public ArrayList<Comercial> getComList() {
        return comercialArrayList;
    }

    @Override
    public String toString() {
        return "Comerciales{" +
                "comercialArrayList=" + comercialArrayList +
                '}';
    }
}
