public class Wallet {
    private LinkedList currencies;
    private Investor owner;

    public Wallet(Investor owner, int cashAmount) {
        this.owner = owner;
        currencies = new LinkedList();
        currencies.addItem(new CCUnits("CAD", cashAmount));
    }

    public boolean hasSufficientCurr(String currID, int amount) {
        boolean result = false;
        LinkItem ownedCurr = currencies.search(currID);

        if (ownedCurr instanceof CCUnits) {
            result = ((CCUnits) currencies.search(currID)).getCurrencyAmount() >= amount;
        }
        return result;
    }
}
