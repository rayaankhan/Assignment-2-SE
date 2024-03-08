

public class A350PlaneFactory extends PlaneFactory {

    public A350PlaneFactory(int passengerCapacity, int crewCapacity) {
        super("A350", passengerCapacity, crewCapacity);
    }
    @Override
    public Plane CreateA350Plane() {
        return new A350Plane();
    }
}