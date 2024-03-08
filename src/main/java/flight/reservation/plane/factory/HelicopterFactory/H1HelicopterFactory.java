

public class H1HelicopterFactory extends HelicopterFactory {

    public H1HelicopterFactory(int passengerCapacity) {
        super("H1", passengerCapacity);
    }
    @Override
    public Helicopter CreateH1Helicopter() {
        return new H1Helicopter();
    }
}