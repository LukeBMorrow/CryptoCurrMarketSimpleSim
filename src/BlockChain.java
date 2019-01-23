public class BlockChain {
    private String currencyID;
    private LinkedList chain;

    public BlockChain(String currencyID){
        this.currencyID= currencyID;
    }

    public void addTransaction(int amount, Investor sender, Investor receiver){
        chain.addItem(new Transaction(amount,sender,receiver,(chain.getTopItem()).getID()));
    }
}
