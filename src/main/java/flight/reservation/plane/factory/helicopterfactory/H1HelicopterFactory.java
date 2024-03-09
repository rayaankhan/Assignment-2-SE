package flight.reservation.plane.factory.helicopterfactory;
import java.util.ArrayList;
import flight.reservation.plane.factory.helicopterfactory.HelicopterFactory;
import flight.reservation.plane.products.helicopter.H1Helicopter;
import flight.reservation.plane.products.helicopter.Helicopter;

public class H1HelicopterFactory extends HelicopterFactory {
    @Override
    public Helicopter CreateHelicopter() {
        return new H1Helicopter();
    }
}