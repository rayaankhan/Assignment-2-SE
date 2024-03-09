package flight.reservation.plane.products.drone;
import java.util.List;
import flight.reservation.plane.products.Vehicle;

public abstract class Drone extends Vehicle {
    public Drone(String model, int passengerCapacity, int crewCapacity)
    {
        super(model,passengerCapacity,crewCapacity);
    }
}
