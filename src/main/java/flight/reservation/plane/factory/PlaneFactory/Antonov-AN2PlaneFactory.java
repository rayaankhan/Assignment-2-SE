

public class Antonov_AN2Plane extends PlaneFactory {

    public Antonov_AN2Plane(int passengerCapacity, int crewCapacity) {
        super("Antonov_AN2", passengerCapacity, crewCapacity);
    }
    @Override
    public Plane CreateAntonov_AN2Plane() {
        return new Antonov_AN2Plane();
    }
}