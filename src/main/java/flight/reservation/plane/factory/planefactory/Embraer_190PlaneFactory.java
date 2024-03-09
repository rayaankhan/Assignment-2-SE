package flight.reservation.plane.factory.planefactory;
import java.util.ArrayList;
import flight.reservation.plane.products.plane.Embraer_190Plane;
import flight.reservation.plane.products.plane.Plane;

public class Embraer_190PlaneFactory extends PlaneFactory {

    @Override
    public Plane CreatePlane() {
        return new Embraer_190Plane();
    }
}