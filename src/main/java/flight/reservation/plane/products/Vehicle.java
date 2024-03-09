package flight.reservation.plane.products;

public abstract class Vehicle {
    private String model;
    private int passengerCapacity;
    private int crewCapacity;

    public Vehicle(String model, int passengerCapacity, int crewCapacity) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;
    }

    public String getModel() { return this.model; }
    public int getPassengerCapacity() { return this.passengerCapacity; }
    public int getCrewCapacity() { return this.crewCapacity; }
}