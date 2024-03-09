
package main.java.flight.reservation.plane.factory.planefactory;
import java.util.ArrayList;
import main.java.flight.reservation.plane.factory.planefactory.PlaneFactory;
import main.java.flight.reservation.plane.products.plane.Embraer_190Plane;

public class Embraer_190Plane extends PlaneFactory {

    @Override
    public Plane CreatePlane() {
        return new Embraer_190Plane();
    }
}