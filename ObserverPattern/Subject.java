package ObserverPattern;

public interface Subject {
    
    void subscribe(Subscriber subscriberName);
    void unsubscribe(Subscriber subscriberName);
    void notifySubscribers(double oldValue, double updatedValue, String companyName);

}
