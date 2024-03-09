package main.java.flight.reservation.plane.factory.planefactory;
import java.util.ArrayList;
import main.java.flight.reservation.plane.factory.planefactory.PlaneFactory;
import main.java.flight.reservation.plane.products.plane.Antonov_AN2Plane;

public class Antonov_AN2Plane extends PlaneFactory {
    @Override
    public Plane CreatePlane() {
        return new Antonov_AN2Plane();
    }
}