import java.util.ArrayList;

public class Airport {


    protected ArrayList<Flight> flight;


    public Airport() {
        this.flight = new ArrayList<>();
    }



    // method

    //passenger sees flight list
    // passenger selects flight via destination
    // accept if status is "Active", reject if "Cancelled"
    // add passenger to said flight via flight id






    public int getFlightCount(){
        return this.flight.size();
    }

    public void addFlight(Flight flight) {
        this.flight.add(flight);
    }


    // getters and setters


    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(ArrayList<Flight> flight) {
        this.flight = flight;
    }


}
