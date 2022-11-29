import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FlightTest {

    private Flight flight;

    @BeforeEach
    public void setUp() {
        flight = new Flight("Active", "Berlin", 763498237);

    }

    @Test
    public void canCountPassengers() {
        int passenger = flight.getPassengerCount();
        assertThat(passenger).isEqualTo(0);

    }

    @Test
        public void addPassenger() {
        Passenger jack = new Passenger("Jack");
        flight.addPassenger(jack);
        int passengerCount = flight.getPassengerCount();
        assertThat(passengerCount).isEqualTo(1);

    }



}
