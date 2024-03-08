

public abstract class HelicopterFactory {

    public HelicopterFactory(String model, int passengerCapacity) {
        super(model, passengerCapacity, 0);
    }
    public abstract Helicopter CreateH1Helicopter();
    public abstract Helicopter CreateH2Helicopter();
}