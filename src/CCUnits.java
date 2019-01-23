public class CCUnits extends LinkItems {
    private String currencyID;
    private int currencyAmount;

    public CCUnits(String currencyID, int currencyAmount) {
        this.currencyID = currencyID;
        this.currencyAmount = currencyAmount;
    }

    public String getID() {
        return currencyID;
    }

    public int getCurrencyAmount() {
        return currencyAmount;
    }

    public void addCurrencyAmount(int amount) {
        this.currencyAmount += amount;
    }
}
