package flight.reservation.plane.factory.planefactory;
import java.util.ArrayList;
import flight.reservation.plane.products.plane.Antonov_AN2Plane;
import flight.reservation.plane.products.plane.Plane;

public class Antonov_AN2PlaneFactory extends PlaneFactory {
    @Override
    public Plane CreatePlane() {
        return new Antonov_AN2Plane();
    }
}