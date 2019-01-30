/*
    Profile
    This class holds all of an investors currencies with a linked list and controls access
    behaviours include:
    -hasSufficientCurr      checks to see if there is more than the specified amount of
                            a type currency in this Profile.
    -addCurrency            adds a specified amount of the given currency type to the Profile.
    -removeCurrency         removes a specified amount of a specific type of currency
 */
public class Profile {
    private LinkedList currencies;

    public Profile(int cashAmount) {
        currencies = new LinkedList();
        currencies.addItem(new CurrUnits("CAD", cashAmount));
    }

    public boolean hasSufficientCurr(String currID, int amount) {
        boolean result = false;
        LinkItem ownedCurr = currencies.search(currID);

        if (ownedCurr instanceof CurrUnits) {
            result = ((CurrUnits) ownedCurr).getCurrencyAmount() >= amount;
        }
        return result;
    }

    public void addCurrency(String currID, int amount) {
        LinkItem ownedCurr = currencies.search(currID);
        if (ownedCurr == null) {
            currencies.addItem(new CurrUnits(currID, amount));
        } else {
            if (ownedCurr instanceof CurrUnits) {
                ((CurrUnits) ownedCurr).addOrSubtractCurrency(amount);
            }
        }
    }

    public void removeCurrency(String currID, int amount) {
        LinkItem ownedCurr = currencies.search(currID);

        if (ownedCurr instanceof CurrUnits) {
            assert (((CurrUnits) ownedCurr).getCurrencyAmount() >= amount);//a non-assert check is done in 'Market'
            ((CurrUnits) ownedCurr).addOrSubtractCurrency(-amount);
        }
    }

    @Override
    public String toString() {
        return " $" + ((CurrUnits) currencies.search("CAD")).getCurrencyAmount() + "\n\t" + currencies;
    }
}
