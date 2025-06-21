package ObserverPatternExample;

import java.util.*;

interface StockFeed {
    void addSubscriber(StockListener listener);
    void removeSubscriber(StockListener listener);
    void broadcastUpdate();
}

interface StockListener {
    void update(String symbol, double price);
}

class StockMarketService implements StockFeed {
    private List<StockListener> subscribers = new ArrayList<>();
    private String lastUpdatedSymbol;
    private double latestPrice;

    public void changeStockPrice(String stockSymbol, double newPrice) {
        lastUpdatedSymbol = stockSymbol;
        latestPrice = newPrice;
        broadcastUpdate();
    }

    public void addSubscriber(StockListener listener) {
        subscribers.add(listener);
    }

    public void removeSubscriber(StockListener listener) {
        subscribers.remove(listener); 
    }

    public void broadcastUpdate() {
        for (StockListener listener : subscribers) {
            listener.update(lastUpdatedSymbol, latestPrice);
        }
    }
}

class MobileStockApp implements StockListener {
    private String name;

    public MobileStockApp(String name) {
        this.name = name;
    }

    public void update(String stockSymbol, double stockPrice) {
        System.out.println(name + " >> Update received: " + stockSymbol + " is $" + stockPrice);
    }
}

class WebStockApp implements StockListener {
    private String webClientName;

    public WebStockApp(String name) {
        this.webClientName = name;
    }

    public void update(String symbol, double price) {
        System.out.println(webClientName + " >> Notified: " + symbol + " trading at $" + price);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarketService stockService = new StockMarketService();

        StockListener phoneApp = new MobileStockApp("PhoneApp-1");
        StockListener browserApp = new WebStockApp("WebPortal-1");

        stockService.addSubscriber(phoneApp);
        stockService.addSubscriber(browserApp);

        stockService.changeStockPrice("ABC", 189.50); 
        stockService.changeStockPrice("DEF", 2735.00); 

        stockService.removeSubscriber(browserApp);

        stockService.changeStockPrice("GHI", 350.25); 
    }
}
