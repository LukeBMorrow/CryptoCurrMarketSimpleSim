public class Investor {
    private String name;
    private String userID;
    private int cash;

    public Investor(String name, String userID, int cash){
        this.name=name;
        this.userID=userID;
        this.cash=cash;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public String getUserID() {
        return userID;
    }
}
