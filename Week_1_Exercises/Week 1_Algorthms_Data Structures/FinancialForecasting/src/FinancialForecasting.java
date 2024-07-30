public class FinancialForecasting {

    public static double calculateFutureValue(double initialValue, double growth, int Time) {
        if (Time == 0) {
            return initialValue;
        }
        double previousValue = calculateFutureValue(initialValue, growth, Time - 1);
        return previousValue * (1 + growth);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growth = 0.05;
        int Time = 10;

        double futureValue = calculateFutureValue(initialValue, growth, Time);

        System.out.println("The future value after " + Time + " periods is: " + futureValue);
    }
}

