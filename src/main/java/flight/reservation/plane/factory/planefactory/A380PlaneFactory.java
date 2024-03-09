package flight.reservation.plane.factory.planefactory;
import java.util.ArrayList;
import flight.reservation.plane.products.plane.A380Plane;
import flight.reservation.plane.products.plane.Plane;

public class A380PlaneFactory extends PlaneFactory {
        
    @Override
    public Plane CreatePlane() {
        return new A380Plane();
    }
}