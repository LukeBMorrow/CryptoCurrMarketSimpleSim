/*
    Investor
    This class groups together all of the items required to make an investor.
    behaviours include:
    -getID              returns the ID of the investor
    -report             prints the investors details including everything currently in their Profile(aka wallet)
    -hasSufficientCurr  see if the investor has more than the passed amount of a specific type of currency
    -transfer           sends a type of currency from this investor to the investor given as a parameter
    -receive            allows for other classes to give this investor currency (used for mining).
*/
public class Investor extends LinkItem {
    private String name;
    private String userID;
    private Profile wallet;

    public Investor(String name, String userID, int cash) {
        this.name = name;
        this.userID = userID;
        wallet = new Profile(cash);
    }

    public String getID() {
        return userID;
    }

    public void report() {
        System.out.println(name + " " + userID + " " + wallet);
    }

    @Override
    public String toString() {
        return name + " " + userID;
    }

    public boolean hasSufficientCurr(String currID, int amount) {
        return wallet.hasSufficientCurr(currID, amount);
    }

    public void transfer(String currID, int amount, Investor receiver) {
        wallet.removeCurrency(currID, amount);
        receiver.receive(currID, amount);
    }

    public void receive(String currID, int amount) {
        wallet.addCurrency(currID, amount);
    }
}
