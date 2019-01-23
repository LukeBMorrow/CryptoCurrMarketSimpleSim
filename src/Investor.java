public class Investor extends LinkItems{
    private String name;
    private String userID;
    private Wallet wallet;

    public Investor(String name, String userID, int cash){
        this.name=name;
        this.userID=userID;
        wallet = new Wallet(this,cash);
    }

    public String getID() {
        return userID;
    }

    public void addCurr(String currID, int ammount){
        wallet.addCurrency(currID,ammount);
    }

    public boolean subtractCurr(String currID, int ammount){
        return wallet.subtractCurrency(currID,ammount);
    }

}
