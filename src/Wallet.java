public class Wallet {
    private LinkedList currencies;
    private Investor owner;

    public Wallet(Investor owner, int cashAmount) {
        this.owner = owner;
        currencies = new LinkedList();
        currencies.addItem(new CCUnits("CAD", cashAmount));
    }

    public void addCurrency(String currID, int amount) {

    }

    public boolean subtractCurrency(String currID, int amount) {
        boolean result = true;
        CCUnits ownedCurrency = (CCUnits) currencies.search(currID);
        if (ownedCurrency.getCurrencyAmount() > amount) {
            ownedCurrency.addCurrencyAmount(-amount);
        } else {
            result = false;
        }
        return result;
    }
}
