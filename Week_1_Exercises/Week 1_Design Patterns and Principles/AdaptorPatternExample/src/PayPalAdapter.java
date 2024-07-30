public class PayPalAdapter implements PaymentProcessor{
    private paypal payPal;
    public PayPalAdapter(paypal payPal) {
        this.payPal = payPal;
    }
    public void processPayment(double amount) {
        //send.payment
        payPal.sendPayment(amount);
    }
}
