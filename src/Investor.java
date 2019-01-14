public class Investor {
    private String name;
    private String userID;
    private int cash;
    private LinkedList wallet;

    public Investor(String name, String userID, int cash){
        this.name=name;
        this.userID=userID;
        this.cash=cash;
        wallet = new LinkedList();
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

    public int mine(String currID){
        return 0;
    }

}
