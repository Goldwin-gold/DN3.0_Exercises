
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123", "12/25");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(456);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.pay(4563);
    }
}
