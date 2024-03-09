import flight.reservation.Airport;
import flight.reservation.flight.builder.Schedule;
import flight.reservation.flight.builder.Flight;
import flight.reservation.plane.factory.planefactory.*;


import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Airport> airports = Arrays.asList(
            new Airport("Berlin Airport", "BER", "Berlin, Berlin"),
            new Airport("Frankfurt Airport", "FRA", "Frankfurt, Hesse"),
            new Airport("Madrid Barajas Airport", "MAD", "Barajas, Madrid"),
            new Airport("Guarulhos International Airport", "GRU", "Guarulhos (São Paulo)"),
            new Airport("John F. Kennedy International Airport", "JFK", "Queens, New York, New York"),
            new Airport("Istanbul Airport", "IST", "Arnavutköy, Istanbul"),
            new Airport("Dubai International Airport", "DXB", "Garhoud, Dubai"),
            new Airport("Chengdu Shuangliu International Airport", "CTU", "Shuangliu-Wuhou, Chengdu, Sichuan")
    );
        private static A350PlaneFactory a350PlaneFactory = new A350PlaneFactory();
        private static A380PlaneFactory a380PlaneFactory = new A380PlaneFactory();
        private static Antonov_AN2PlaneFactory antonov_an2PlaneFactory = new Antonov_AN2PlaneFactory();
        private static Embraer_190PlaneFactory embraer_190PlaneFactory = new Embraer_190PlaneFactory();

    static List<Object> aircrafts = Arrays.asList(
            a350PlaneFactory.CreatePlane(),
            a380PlaneFactory.CreatePlane(),
            antonov_an2PlaneFactory.CreatePlane(),
            embraer_190PlaneFactory.CreatePlane()

    );
    // System.out.println(aircrafts[0].getModel());

//     static List<Flight> flights = Arrays.asList(
//             new Flight(1, airports.get(0), airports.get(1), aircrafts.get(0)),
//             new Flight(2, airports.get(1), airports.get(2), aircrafts.get(1)),
//             new Flight(3, airports.get(2), airports.get(4), aircrafts.get(2)),
//             new Flight(4, airports.get(3), airports.get(2), aircrafts.get(3)),
//             new Flight(5, airports.get(4), airports.get(2), aircrafts.get(4)),
//             new Flight(6, airports.get(5), airports.get(7), aircrafts.get(5))
//     );

    static Schedule schedule;

    public static void main(String[] args) {
    }
}
