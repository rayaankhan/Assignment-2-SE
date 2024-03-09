package flight.reservation.plane.products.helicopter;
import java.util.List;
import flight.reservation.plane.products.Vehicle;

public abstract class Helicopter extends Vehicle {

    public Helicopter(String model, int passengerCapacity, int crewCapacity)
    {
        super(model,passengerCapacity,crewCapacity);
    }
}
