public class Investor extends LinkItems{
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

    public String getID() {
        return userID;
    }

}
