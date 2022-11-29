import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightID;
    private ArrayList <Passenger> passenger;
    private String status;


    public Flight(String status, String destination, int flightID) {
        this.status = status;
        this.destination = destination;
        this.flightID = flightID;
        this.passenger = new ArrayList<>();

    }

    // methods

    public int getPassengerCount(){
        return this.passenger.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passenger.add(passenger);
    }




    // getters and setters

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public ArrayList<Passenger> getPassenger() {
        return passenger;
    }

    public void setPassenger(ArrayList<Passenger> passenger) {
        this.passenger = passenger;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




}
