public class Market {
    private Investor a ;
    public void newInvestor(String name, String userID, int cash){
        a= new Investor(name,userID,cash);
    }

    public Investor getInvestor(String id){
        return a;
    }

    public void trade(int amount, String currencyID, Investor sender, Investor receiver){

    }
}
