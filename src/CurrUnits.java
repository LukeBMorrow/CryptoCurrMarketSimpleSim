public class CurrUnits extends LinkItem {
    private String currencyID;
    private int currencyAmount;

    public CurrUnits(String currencyID, int currencyAmount) {
        this.currencyID = currencyID;
        this.currencyAmount = currencyAmount;
    }

    public String getID() {
        return currencyID;
    }

    public int getCurrencyAmount() {
        return currencyAmount;
    }

    public void addOrSubtractCurrency(int amount) {
        assert((amount+currencyAmount)>=0);
        currencyAmount += amount;
    }

    @Override
    public String toString() {
        return currencyAmount+" "+currencyID;
    }
}
