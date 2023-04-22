package ObserverPattern;

import java.util.HashMap;

public class ShareMarket {
    private HashMap<String, Double> companyToSharePrice = new HashMap<>();
    // ShareMarketPublisher shareMarketPublisher;

    ShareMarket() {
        // Set initial values

        companyToSharePrice.put("AAPL", 100.0);
        companyToSharePrice.put("AMZ", 91.23);
        companyToSharePrice.put("META", 23.43);

        // shareMarketPublisher  = new ShareMarketPublisher();
    }

    public void updateSharePrice(String companyName, double shareValue, ShareMarketPublisher shareMarketPublisher) {

        double oldSharePrice = 0.0;
        if (companyToSharePrice.containsKey(companyName)) {
            oldSharePrice = companyToSharePrice.get(companyName);
            System.out.println("Found " + companyName + " value = " + oldSharePrice);
            companyToSharePrice.put(companyName, shareValue);
        }

        shareMarketPublisher.notifySubscribers(oldSharePrice, shareValue, companyName);

    }

    public void viewSharePrice(String companyName) {
        if (companyToSharePrice.containsKey(companyName)) {
            System.out.println("Share price for " + companyName + "is " + companyToSharePrice.get(companyName));
        }
    }
}