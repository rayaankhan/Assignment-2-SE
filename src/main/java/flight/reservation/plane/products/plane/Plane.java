
package flight.reservation.plane.products.plane;
import java.util.List;
import flight.reservation.plane.products.Vehicle;

public abstract class Plane extends Vehicle {
    public Plane(String model, int passengerCapacity, int crewCapacity)
    {
        super(model,passengerCapacity,crewCapacity);
    }
}
