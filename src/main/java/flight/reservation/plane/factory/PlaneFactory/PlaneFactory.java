

public abstract class PlaneFactory {

    public PlaneFactory(String model, int passengerCapacity, int crewCapacity) {
        super(model, passengerCapacity, crewCapacity);
    }
    public abstract Plane CreateA350Plane();
    public abstract Plane CreateA380Plane();
    public abstract Plane CreateAntonov_AN2Plane();
    public abstract Plane CreateEmbraer_190Plane();
}