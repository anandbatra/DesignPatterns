package ObserverPattern;
import java.util.ArrayList;
public class ShareMarketPublisher implements Subject{

    ArrayList<Subscriber> subscribers;

    ShareMarketPublisher () {
        subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        showSubscribers();
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        showSubscribers();
    }

    private void showSubscribers() {
        System.out.println("All subscribers = " + subscribers);
    }

    @Override
    public void notifySubscribers(double oldSharePrice, double updatedValue, String companyName) {

        System.out.println("Notifying all subscribers " + subscribers);

        for (Subscriber subscriber : subscribers) {
            System.out.println("Notifying subscriber " + subscriber.getSubscriberName() + "regarding update of " + companyName + " from " + oldSharePrice + " to " + updatedValue);
            subscriber.updateSharePrice(oldSharePrice, updatedValue, companyName);
        }
    }
    
}
