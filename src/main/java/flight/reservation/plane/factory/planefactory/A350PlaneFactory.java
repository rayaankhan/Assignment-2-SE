package flight.reservation.plane.factory.planefactory;
import java.util.ArrayList;
import flight.reservation.plane.products.plane.A350Plane;
import flight.reservation.plane.products.plane.Plane;

public class A350PlaneFactory extends PlaneFactory {

    @Override
    public Plane CreatePlane() {
        return new A350Plane();
    }
}