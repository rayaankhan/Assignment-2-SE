

public class A380PlaneFactory extends PlaneFactory {

    public A380PlaneFactory(int passengerCapacity, int crewCapacity) {
        super("A380", passengerCapacity, crewCapacity);
    }
    @Override
    public Plane CreateA380Plane() {
        return new A380Plane();
    }
}