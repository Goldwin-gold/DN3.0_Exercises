public class Adapterpattern {
    public static void main(String[] args) {
        paypal payPal = new paypal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.processPayment(100.0);
        stripe stripe = new stripe();
        StripAdapter stripeAdapter = new StripAdapter(stripe);
        stripeAdapter.processPayment(200.0);
    }
}
