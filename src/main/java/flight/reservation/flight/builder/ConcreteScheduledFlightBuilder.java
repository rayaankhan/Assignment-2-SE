package flight.reservation.flight.builder;
import flight.reservation.flight.builder.ScheduledFlightBuilder;
import flight.reservation.flight.builder.ScheduledFlight;
import flight.reservation.Passenger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConcreteScheduledFlightBuilder implements ScheduledFlightBuilder {
    private ScheduledFlight scheduledflight;

    public ConcreteScheduledFlightBuilder(Flight flight){
        this.scheduledflight = new ScheduledFlight(flight);
    }

    @Override
    public void setDepartureTime(Date departureTime) {
        this.scheduledflight.setDepartureTime(departureTime);
    }

    @Override
    public void setCurrentPrice(double currentPrice) {
        this.scheduledflight.setCurrentPrice(currentPrice);
    }

    @Override
    public void setPassengers(List<Passenger> passengers) {
        this.scheduledflight.setPassengers(passengers);
    }

    @Override
    public ScheduledFlight build() {
        return scheduledflight;
    }
}