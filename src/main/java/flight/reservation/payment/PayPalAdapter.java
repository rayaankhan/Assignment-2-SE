package flight.reservation.payment;

public class PayPalAdapter implements Payment{

    private Paypal paypal;
    private String email;
    private String password;
    private boolean valid;

    public PayPalAdapter(String email,String password,Paypal payp){
        this.paypal  = payp;
        this.email = email;
        this.password = password;
        this.setValid();
    }

    public boolean isValid(){
        return valid;
    }

    public void setValid(){
        this.valid = this.email != null && this.password != null || this.email.equals(this.paypal.DATA_BASE.get(this.password));
    }

}
