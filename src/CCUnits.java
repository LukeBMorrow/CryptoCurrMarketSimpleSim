public class CCUnits extends LinkItems {
    private Cryptocurrency currencyType;
    private int currencyAmount;

    public CCUnits(Cryptocurrency currencyType, int currencyAmount) {
        this.currencyType = currencyType;
        this.currencyAmount = currencyAmount;
    }

    public String getID() {
        return currencyType.getID();
    }

    public Cryptocurrency getCurrencyType() {
        return currencyType;
    }

    public int getCurrencyAmount() {
        return currencyAmount;
    }

    public void addCurrencyAmount(int amount) {
        this.currencyAmount += amount;
    }
}
