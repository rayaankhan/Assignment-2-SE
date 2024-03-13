package flight.reservation.flight.builder;
import flight.reservation.Customer; // Import the Customer class
import flight.reservation.Airport;
// import flight.reservation.plane.Helicopter;
// import flight.reservation.plane. Drone;
// import flight.reservation.plane. Plane;
import flight.reservation.plane.products.helicopter.Helicopter;
import flight.reservation.plane.products.plane.Plane;
import flight.reservation.plane.products.drone.Drone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flight {

    private int number;
    private Airport departure;
    private Airport arrival;
    protected Object aircraft;
    private List<Customer> observers; // List to hold all observers

    public Flight(int number, Airport departure, Airport arrival, Object aircraft) throws IllegalArgumentException {
        this.number = number;
        this.departure = departure;
        this.arrival = arrival;
        this.aircraft = aircraft;
        this.observers = new ArrayList<>(); // Initialize the observers list
        checkValidity();
    }

    // Method to add an observer
    public void addObserver(Customer customer) {
        if (!observers.contains(customer)) {
            observers.add(customer);
        }
    }

    // Method to remove an observer
    public void removeObserver(Customer customer) {
        observers.remove(customer);
    }

    // Method to notify all observers about an event
    public void notifyObservers(String message) {
        for (Customer observer : observers) {
            observer.update(message); // Assuming Customer class has an update method
        }
    }

    private void checkValidity() throws IllegalArgumentException {
        if (!isAircraftValid(departure) || !isAircraftValid(arrival)) {
            throw new IllegalArgumentException("Selected aircraft is not valid for the selected route.");
        }
    }

    private boolean isAircraftValid(Airport airport) {
        return Arrays.stream(airport.getAllowedAircrafts()).anyMatch(x -> {
            String model;
            if (this.aircraft instanceof  Plane) {
                model = (( Plane) this.aircraft).getModel();
            } else if (this.aircraft instanceof Helicopter) {
                model = ((Helicopter) this.aircraft).getModel();
            } else if (this.aircraft instanceof  Drone) {
                model = "HypaHype";
            } else {
                throw new IllegalArgumentException(String.format("Aircraft is not recognized"));
            }
            return x.equals(model);
        });
    }

    public Object getAircraft() {
        return aircraft;
    }

    public int getNumber() {
        return number;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return aircraft.toString() + "-" + number + "-" + departure.getCode() + "/" + arrival.getCode();
    }

}
