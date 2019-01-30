/*
    CurrUnits
    This class groups a currency type(stored as an ID code) and amount together to be used in the Profile.
    Behaviours include:
    -getID                  returns the ID of the currency type
    -getCurrencyAmount      returns the amount of currency stored in this instance
    -addOrSubtractCurrency  adds the specified amount to currencyAmount
 */
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
        assert ((amount + currencyAmount) >= 0);//the investor should never have negative currency
        currencyAmount += amount;
    }

    @Override
    public String toString() {
        return currencyAmount + " " + currencyID;
    }
}
