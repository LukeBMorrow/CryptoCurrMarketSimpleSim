/*
    BlockChain
    This class is similar to LinkedList but changes the method of adding items for
    easier used in the blockChain.
    @Overloaded addTransaction
            -(int, Investor, Investor) is for adding trades
            -(int, Investor) is for adding mines
 */
public class BlockChain {
    private Block top;

    public BlockChain() {
        top=null;
    }

    public void addTransaction(int amount, Investor receiver, Investor sender) {
        top = new Block(new Transaction(amount, sender, receiver), top);
    }

    public void addTransaction(int amount, Investor receiver) {
        top = new Block(new Transaction(amount, receiver), top);
    }

    @Override
    public String toString() {
        String result = "";
        Block curr = top;
        while (curr != null) {
            result += curr + "\n\t";
            curr = curr.getNext();
        }
        return result;
    }
}
