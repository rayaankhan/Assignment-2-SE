package flight.reservation.order;

import flight.reservation.Customer;
import flight.reservation.flight.builder.ScheduledFlight;
import flight.reservation.payment.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FlightOrder extends Order {

    private PaymentContext paymentContext = new PaymentContext();

    private final List<ScheduledFlight> flights;
    static List<String> noFlyList = Arrays.asList("Peter", "Johannes");

    public FlightOrder(List<ScheduledFlight> flights) {
        this.flights = flights;
    }

    public static List<String> getNoFlyList() {
        return noFlyList;
    }

    public List<ScheduledFlight> getScheduledFlights() {
        return flights;
    }

    private boolean isOrderValid(Customer customer, List<String> passengerNames, List<ScheduledFlight> flights) {
        boolean valid = true;
        valid = valid && !noFlyList.contains(customer.getName());
        valid = valid && passengerNames.stream().noneMatch(passenger -> noFlyList.contains(passenger));
        valid = valid && flights.stream().allMatch(scheduledFlight -> {
            try {
                return scheduledFlight.getAvailableCapacity() >= passengerNames.size();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
                return false;
            }
        });
        return valid;
    }

    public boolean processOrderWithCreditCard(String number, Date expirationDate, String cvv) throws IllegalStateException {
        CreditCard creditCard = new CreditCard(number, expirationDate, cvv);
        return doPayment(creditCard);
    }

    public boolean processOrderWithPayPal(String email, String password) throws IllegalStateException {
        Paypal paypal = new Paypal(email, password);
        return doPayment(paypal);
    }

    public boolean doPayment(PaymentStrategy paymentStrategy) {
        if (this.isClosed()) {
            // Payment is already proceeded
            return true;
        }

        paymentContext.setPaymentStrategy(paymentStrategy);
        boolean isPaid = paymentContext.executePayment(this.getPrice());
        if (isPaid) {
            this.setClosed();
        }
        return isPaid;
    }

}
