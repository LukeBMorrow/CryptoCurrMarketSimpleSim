public class Investor extends LinkItem {
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

    public void report(){

    }

    public boolean hasSufficientCurr(String currID, int amount){
        return wallet.hasSufficientCurr(currID,amount);
    }

    public void transfer(String currID,int amount, Investor receiver){
        wallet.removeCurrency(currID, amount);
        receiver.wallet.addCurrency(currID, amount);
    }

    public void receive(String currID, int amount){
        wallet.addCurrency(currID, amount);
    }
}
