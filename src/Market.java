public class Market {
    private Investor a;
    private Cryptocurrency b;

    public void newCryptocurrency(String name, String currID, int amount) {
        b = new Cryptocurrency(name, currID, amount);
    }

    public void newInvestor(String name, String userID, int cash) {
        a = new Investor(name, userID, cash);
    }

    public void mine(String investorID, String currID, int amount) {
    }

    public void trade(String investor1, String investor2, String cryptoCurr1, int curr1Amount, String cryptoCurr2, int curr2Amount) {
    }

    public void report(String investorID) {
    }

    public void cryport(String currID) {
    }

}
