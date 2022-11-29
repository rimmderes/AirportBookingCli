import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.*;

public class Runner {


    public static void main(String[] args) {
        menu();
    }

    private static void menu() {


        Scanner scanner = new Scanner(System.in);

        // Beginning of menu

        System.out.println("Welcome to R&W's airlines");

        int selection;
        System.out.println("How may we assist you today? Please select from the following options (select a number)");
        System.out.println("1. Add a Passenger");
        System.out.println("2. Add a New Flight");
        System.out.println("3. Display all Flights");
        System.out.println("4. Book a passenger onto a flight");
        System.out.println("5. Cancel a flight");

        System.out.println("Your selected option is: ");

        selection = scanner.nextInt();

        switch(selection) {
            case 1:
                addPassengers();
                break;

            case 2:

                System.out.println("Where would your passenger like to go?");

                menu();

                break;
            case 3:

        // listing flights

        System.out.println("These are all available flights for today: ");

        Airport airport = new Airport();

        Flight flight1 = new Flight("active", "Tokyo", 743028409);
        Flight flight2 = new Flight("active", "Berlin", 743028410);
        Flight flight3 = new Flight("active", "London", 743028411);
        Flight flight4 = new Flight("active", "Chicago", 743028412);
        Flight flight5 = new Flight("cancelled", "Dubai", 743028413);
        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);
        airport.addFlight(flight4);
        airport.addFlight(flight5);



        // removing a cancelled flight


        ArrayList<Flight> flights = airport.getFlight();
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getStatus() == "cancelled") {
                flights.remove(i);
            }
        }

        airport.setFlight(flights);  // puts flights back into the airport


        for (Flight flight : airport.getFlight()) {
            System.out.println("The flight's destination is " + flight.getDestination() + " and status is " + flight.getStatus() + ".");
        }

        menu();

        break;

            case 4:

                System.out.println("Which flight would the passenger like to fly with?");


                menu();

                break;

            case 5:
                System.out.println("Which flight would you like to cancel");


                menu();

                break;

    }
    }

    private static void addPassengers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String passengerName = scanner.nextLine();
        System.out.println("Please enter your contactInfo");
        String contactInfo = scanner.nextLine();

        Random random = new Random();
        int idNumber = random.nextInt(1000, 5001);

        System.out.println("Your ID number : " + idNumber);


        System.out.println("Your name number is " + passengerName + ", your contact information is " + contactInfo + ", and your ID Number is : " + idNumber);

        menu();

    }
}

