package flight.reservation.flight.builder;

import flight.reservation.Airport;
import flight.reservation.Passenger;
import flight.reservation.plane.products.helicopter.Helicopter;
import flight.reservation.plane.products.plane.Plane;
import flight.reservation.plane.products.drone.Drone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduledFlight extends Flight {

    private List<Passenger> passengers;
    private Date departureTime;
    private double currentPrice = 100;

    public ScheduledFlight(Flight flight) {
        super(flight.getNumber(), flight.getDeparture(), flight.getArrival(), flight.getAircraft());
        this.passengers = new ArrayList<>();
    }

    public int getCrewMemberCapacity() throws NoSuchFieldException {
        if (this.aircraft instanceof Plane) {
            return ((Plane) this.aircraft).getCrewCapacity();
        }
        if (this.aircraft instanceof Helicopter) {
            return ((Helicopter) this.aircraft).getCrewCapacity();
        }
        if (this.aircraft instanceof Drone) {
            return ((Drone) this.aircraft).getCrewCapacity();
        }
        throw new NoSuchFieldException("this aircraft has no information about its crew capacity");
    }

    public void addPassengers(List<Passenger> passengers) {
        this.passengers.addAll(passengers);
    }

    public void removePassengers(List<Passenger> passengers) {
        this.passengers.removeAll(passengers);
    }

    public int getCapacity() throws NoSuchFieldException {
        if (this.aircraft instanceof Plane) {
            return ((Plane) this.aircraft).getPassengerCapacity();
        }
        if (this.aircraft instanceof Helicopter) {
            return ((Helicopter) this.aircraft).getPassengerCapacity();
        }
        if (this.aircraft instanceof Drone) {
            return ((Drone) this.aircraft).getPassengerCapacity();
        }
        throw new NoSuchFieldException("this aircraft has no information about its capacity");
    }

    public int getAvailableCapacity() throws NoSuchFieldException {
        return this.getCapacity() - this.passengers.size();
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date setDepartureTime(Date departureTime) {
        return this.departureTime = departureTime;
    }

    public List<Passenger> setPassengers(List<Passenger> passengers) {
        return this.passengers = new ArrayList<>();
    }
}
