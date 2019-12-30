import java.util.ArrayList;

public class Airports {
    ArrayList<Airport> AirportsLists;

    public Airports(){
        AirportsLists = new ArrayList<Airport>();
    }

    public void addAirport(Airport airport){
        AirportsLists.add(airport);
    }

    @Override
    public String toString() {
        return "Airports{" +
                "AirportsLists=" + AirportsLists +
                '}';
    }

    public ArrayList<Airport> getAirportsLists() {
        return AirportsLists;
    }

    public void setAirportsLists(ArrayList<Airport> airportsLists) {
        AirportsLists = airportsLists;
    }
}
