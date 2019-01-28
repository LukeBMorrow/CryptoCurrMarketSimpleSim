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
            result = ((CurrUnits) currencies.search(currID)).getCurrencyAmount() >= amount;
        }
        return result;
    }

    public void addCurrency(String currID, int amount){
        LinkItem ownedCurr = currencies.search(currID);
        if(ownedCurr==null){
            currencies.addItem(new CurrUnits(currID, amount));
        }else {
            if (ownedCurr instanceof CurrUnits) {
                ((CurrUnits) ownedCurr).addOrSubtractCurrency(amount);
            }
        }
    }

    public void removeCurrency(String currID, int amount){
        LinkItem ownedCurr = currencies.search(currID);
        if(ownedCurr==null){
            currencies.addItem(new CurrUnits(currID, amount));
        }else {
            if (ownedCurr instanceof CurrUnits) {
                ((CurrUnits) ownedCurr).addOrSubtractCurrency(-amount);
            }
        }
    }

    @Override
    public String toString(){
        return " $"+((CurrUnits)currencies.search("CAD")).getCurrencyAmount()+"\n\t"+currencies;
    }
    /*
    name id cash
        transaction1
        transaction2
        transaction3
        transaction4
        transaction5
        transaction6
     */
}
