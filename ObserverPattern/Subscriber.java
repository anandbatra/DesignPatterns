package ObserverPattern;

/**
 * Subscriber interface
 */
public interface Subscriber {

    public void updateSharePrice(double oldValue, double updatedValue, String companyName);

    public String getSubscriberName();

}
