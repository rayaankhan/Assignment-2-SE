package flight.reservation.flight.builder;
import flight.reservation.flight.builder.ScheduledFlight;
import flight.reservation.Passenger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface ScheduledFlightBuilder {
    public void setDepartureTime(Date departureTime);
    public void setCurrentPrice(double currentPrice);
    public void setPassengers(List<Passenger> passengers);
    ScheduledFlight build();
}