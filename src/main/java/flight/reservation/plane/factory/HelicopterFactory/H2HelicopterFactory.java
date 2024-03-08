

public class H2HelicopterFactory extends HelicopterFactory {

    public H2HelicopterFactory(int passengerCapacity) {
        super("H2", passengerCapacity);
    }
    @Override
    public Helicopter CreateH2Helicopter() {
        return new H2Helicopter();
    }
}