

public class Embraer_190Plane extends PlaneFactory {

    public Embraer_190Plane(int passengerCapacity, int crewCapacity) {
        super("Embraer_190", passengerCapacity, crewCapacity);
    }
    @Override
    public Plane CreateEmbraer_190Plane() {
        return new Embraer_190Plane();
    }
}