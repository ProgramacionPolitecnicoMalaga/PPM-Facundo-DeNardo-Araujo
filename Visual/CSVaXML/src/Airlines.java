import java.util.ArrayList;

public class Airlines {
    private ArrayList<Airline> aerolineas;

    public Airlines(){
        aerolineas = new ArrayList<>();
    }

    public void addAirline(Airline airline){
        aerolineas.add(airline);
    }

    public ArrayList<Airline> getAerolineas() {
        return aerolineas;
    }

    @Override
    public String toString() {
        return "Airlines{" +
                "aerolineas=" + aerolineas +
                '}';
    }
}
