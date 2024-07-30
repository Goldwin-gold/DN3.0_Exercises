import java.util.ArrayList;
import java.util.List;

interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;
    private double value;

    public StockMarket(String stockName, double price, double value) {
        this.stockName = stockName;
        this.price = price;
        this.value = value;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public void setValue(double value) {
        this.value = value;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price, value);
        }
    }
}

interface Observer {
    void update(String stockName, double price, double value);
}

class MobileApp implements Observer {
    @Override
    public void update(String stockName, double price, double value) {
        System.out.println("MobileApp: Stock " + stockName + " is now $" + price + " and value $" + value);
    }
}

class WebApp implements Observer {
    @Override
    public void update(String stockName, double price, double value) {
        System.out.println("WebApp: Stock " + stockName + " is now $" + price + " and value $" + value);
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("TechCorp", 100.00, 100.00);

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Changing stock price to $105.00");
        stockMarket.setPrice(105.00);
        stockMarket.setValue(117.00);

        System.out.println("\nChanging stock price to $110.00");
        stockMarket.setPrice(110.00);
        stockMarket.setValue(130.00);

        stockMarket.deregisterObserver(mobileApp);

        System.out.println("\nChanging stock price to $120.00");
        stockMarket.setPrice(120.00);
        stockMarket.setValue(140.00);
    }
}
