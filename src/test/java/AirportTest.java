import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AirportTest {

    private Airport airport;
    private Flight flight;

    @BeforeEach
    public void setUp() {
        Flight flight = new Flight("active", "Tokyo", 743028409);
        Passenger passenger = new Passenger("Jack");




    }

    @Test
    public void canCountFlight() {
        int flight = airport.getFlightCount();
        assertThat(flight).isEqualTo(0);

    }

    @Test
    public void addFlight() {
        Flight boeing875 = new Flight("Active", "Tokyo", 7584975);
        airport.addFlight(boeing875);
        int flightCount = airport.getFlightCount();
        assertThat(flightCount).isEqualTo(1);

    }




}
