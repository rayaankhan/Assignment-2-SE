package main.java.flight.reservation.plane.factory.planefactory;
import java.util.ArrayList;
import main.java.flight.reservation.plane.factory.planefactory.PlaneFactory;
import main.java.flight.reservation.plane.products.plane.A380Plane;

public class A380PlaneFactory extends PlaneFactory {
        
    @Override
    public Plane CreatePlane() {
        return new A380Plane();
    }
}