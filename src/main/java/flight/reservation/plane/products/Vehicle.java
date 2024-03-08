

public abstract class Vehicle {
    private string model;
    private int passengerCapacity;
    private int crewCapacity;

    public Vehicle(string model, int passengerCapacity, int crewCapacity) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;
    }

    public getModel() { return this.model; }
    public getPassengerCapacity() { return this.passengerCapacity; }
    public getCrewCapacity() { return this.crewCapacity; }
}