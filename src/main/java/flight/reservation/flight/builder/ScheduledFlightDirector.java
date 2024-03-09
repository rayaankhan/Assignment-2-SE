package flight.reservation.flight.builder;
import flight.reservation.flight.builder.ScheduledFlightBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ScheduledFlightDirector {
    private ScheduledFlightBuilder scheduledFlightBuilder;

    public ScheduledFlightDirector(ScheduledFlightBuilder scheduledFlightBuilder) {
        this.scheduledFlightBuilder = scheduledFlightBuilder;
    }

    public void construct(Date departureTime, double currentPrice) {
        scheduledFlightBuilder.setDepartureTime(departureTime);
        scheduledFlightBuilder.setCurrentPrice(currentPrice);
    }

    public ScheduledFlight getFlight() {
        return scheduledFlightBuilder.build();
    }
}