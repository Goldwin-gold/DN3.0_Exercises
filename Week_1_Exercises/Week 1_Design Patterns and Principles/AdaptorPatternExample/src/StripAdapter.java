public class StripAdapter {
    private stripe stripe;

    public StripAdapter(stripe stripe) {
        this.stripe = stripe;
    }

    public void processPayment(double amount) {
        //make.payment
        stripe.makePayment(amount);
    }
}
