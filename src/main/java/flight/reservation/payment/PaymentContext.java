package flight.reservation.payment;

import java.util.Date;

public class PaymentContext {
    private PaymentStrategy paymentStrategy = null;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean executePayment(double price) {
        if (this.paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set");
        }
        return paymentStrategy.pay(price);
    }
}