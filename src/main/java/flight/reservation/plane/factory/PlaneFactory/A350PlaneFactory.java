package main.java.flight.reservation.plane.factory.planefactory;
import java.util.ArrayList;
import main.java.flight.reservation.plane.factory.planefactory.PlaneFactory;
import main.java.flight.reservation.plane.products.plane.A350Plane;

public class A350PlaneFactory extends PlaneFactory {

    @Override
    public Plane CreatePlane() {
        return new A350Plane();
    }
}