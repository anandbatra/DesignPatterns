package ObserverPattern;

public class MarketMover {
    
    public static void main(String args[]) {

        ShareMarketPublisher shareMarketPublisher = new ShareMarketPublisher();;

        System.out.println("Registering Zerodha");
        Broker zerodha = new Broker("Zerodha");
        zerodha.subscribe(shareMarketPublisher, zerodha);

        System.out.println("Registering Groww");
        Broker groww = new Broker("Groww");
        groww.subscribe(shareMarketPublisher, groww);
        
        ShareMarket shareMarket = new ShareMarket();
        shareMarket.viewSharePrice("AAPL");

        System.out.println("Updating Share price of AAPL to 200");
        shareMarket.updateSharePrice("AAPL", 200.0, shareMarketPublisher);

        System.out.println("Un-registering groww");
        groww.unsubscribe(shareMarketPublisher, groww);

        System.out.println("Updating Share price of AAPL to 300");
        shareMarket.updateSharePrice("AAPL", 300.0, shareMarketPublisher);

    }

    

}
