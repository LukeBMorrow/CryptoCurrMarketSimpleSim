public class BlockChain extends LinkedList{
    private Block top;

    public BlockChain(){
        super();
    }

    public void addTransaction(int amount, Investor receiver, Investor sender){
        top = new Block(new Transaction(amount,sender,receiver),top);
    }
    public void addTransaction(int amount, Investor receiver){
        top = new Block(new Transaction(amount,receiver),top);
    }
}
