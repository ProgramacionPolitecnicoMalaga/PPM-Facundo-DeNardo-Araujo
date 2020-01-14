import java.util.ArrayList;

public class Comerciales {
    private ArrayList<Comercial> Registrados;

    public Comerciales(){
        Registrados = new ArrayList<>();
    }

    public void registrarComercial(Comercial comercial){
        Registrados.add(comercial);
    }

    public ArrayList<Comercial> getRegistrados() {
        return Registrados;
    }
}
