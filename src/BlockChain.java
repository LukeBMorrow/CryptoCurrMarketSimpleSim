public class BlockChain {
    private String currencyID;
    private LinkedList chain;

    public BlockChain(String currencyID){
        this.currencyID= currencyID;
    }

    public void addTransaction(int amount, Investor receiver, Investor sender){
        chain.addItem(new Transaction(amount,sender,receiver,chain.getTopItem().getID()));
    }
    public void addTransaction(int amount, Investor receiver){
        chain.addItem(new Transaction(amount,receiver,chain.getTopItem().getID()));
    }
}
