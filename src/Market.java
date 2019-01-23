public class Market {
    private LinkedList investors;
    private LinkedList cryptoCurrencies;

    public Market() {
        investors = new LinkedList();
        cryptoCurrencies = new LinkedList();
    }

    public void newCryptocurrency(String name, String currID, int amount) {
        cryptoCurrencies.addItem(new Cryptocurrency(name, currID, amount));
    }

    public void newInvestor(String name, String userID, int cash) {
        investors.addItem(new Investor(name, userID, cash));
    }

    public void mine(String investorID, String currID, int amount) {
        Cryptocurrency chCurrency = (Cryptocurrency) cryptoCurrencies.search(currID);
        if(chCurrency.getQuantity()>amount){

        }
    }

    public void trade(String investor1, String investor2, String cryptoCurr1, int curr1Amount, String cryptoCurr2, int curr2Amount) {
    }

    public void report(String investorID) {
    }

    public void cryport(String currID) {
    }

}
