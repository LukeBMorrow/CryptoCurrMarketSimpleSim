public class Market {
    private HashTable investors;
    private HashTable cryptoCurrencies;

    public Market() {
        investors = new HashTable();
        cryptoCurrencies = new HashTable();
    }

    public void newCryptocurrency(String name, String currID, int amount) {
        cryptoCurrencies.addItem(new Cryptocurrency(name, currID, amount));
    }

    public void newInvestor(String name, String userID, int cash) {
        investors.addItem(new Investor(name, userID, cash));
    }

    public void mine(String investorID, String currID, int amount) {
        ((Cryptocurrency) cryptoCurrencies.getItem(currID)).mine();
    }

    public void trade(String investor1, String investor2, String cryptoCurr1, int curr1Amount, String cryptoCurr2, int curr2Amount) {
    }

    public void report(String investorID) {
        investors.getItem(investorID).report();
    }

    public void cryport(String currID) {
        cryptoCurrencies.getItem(currID).report();
    }

}
