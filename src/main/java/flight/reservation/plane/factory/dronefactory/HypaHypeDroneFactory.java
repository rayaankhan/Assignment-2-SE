package  flight.reservation.plane.factory.dronefactory;
import java.util.ArrayList;
import  flight.reservation.plane.factory.dronefactory.DroneFactory;
import  flight.reservation.plane.products.drone.HypaHypeDrone;
import flight.reservation.plane.products.drone.Drone;

public class HypaHypeDroneFactory extends DroneFactory {
    @Override
    public Drone CreateDrone() {
        return new HypaHypeDrone();
    }
}