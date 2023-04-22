package ObserverPattern;

public class Broker implements Subscriber{
    
    String subscriberName;
    // ShareMarketPublisher shareMarketPublisher = new ShareMarketPublisher();;
    // Broker broker; 

    Broker(String brokerName) {
        // broker = new Broker(brokerName);
        subscriberName = brokerName;
    }

    @Override
    public void updateSharePrice(double oldValue, double updatedValue, String companyName) {
        System.out.println("Broker:" + subscriberName + ": Updated share price of " + companyName + " from " + oldValue + " to " + updatedValue);
    }

    public void subscribe(ShareMarketPublisher shareMarketPublisher, Broker broker) {
        shareMarketPublisher.subscribe(broker);
        System.out.println("Subscription successful for " + subscriberName);
    }

    public void unsubscribe(ShareMarketPublisher shareMarketPublisher, Broker broker) {
        shareMarketPublisher.unsubscribe(broker);
        System.out.println("Unsubscribe successful for " + subscriberName);
    }

    @Override
    public String getSubscriberName() {
        return subscriberName;
    }
}
