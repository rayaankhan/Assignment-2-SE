package flight.reservation.payment;

import java.util.HashMap;
import java.util.Map;

public class Paypal implements PaymentStrategy {
    public static final Map<String, String> DATA_BASE = new HashMap<>();

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    private String email;
    private String password;

    public Paypal(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean pay(double price) throws IllegalStateException {
        if (email.equals(Paypal.DATA_BASE.get(password))) {
            System.out.println("Paying " + price + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }
}
