/*
    Transaction
    This class groups together all of the information that is recorded from a transaction, in the style
    of a record.
    The crypto-currency type isn't present because the only way of accessing the transaction is
    through the crypto-currencies blockChain.
 */
public class Transaction {
    private boolean isTrade;
    private int amount;
    private Investor receiver;
    private Investor sender;

    public Transaction(int amount, Investor receiver, Investor sender) {
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        isTrade = true;
    }

    public Transaction(int amount, Investor receiver) {
        this.amount = amount;
        this.receiver = receiver;
        isTrade = false;
    }

    public String toString() {
        String result;
        if (isTrade) {
            result = (" Trade: R:" + receiver.getID() + " S:" + sender.getID() + " " + amount);
        } else {
            result = (" Mine: R:" + receiver.getID() + " " + amount);
        }
        return result;
    }
}
