import java.util.HashSet;

public class Ciudades {
    HashSet<Ciudad> ciudades;

    public Ciudades(){
        ciudades = new HashSet<>();
    }

    public void addCiudad(Ciudad ciudad){
        ciudades.add(ciudad);
    }
}
