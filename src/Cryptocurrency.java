/*
    Cryptocurrency
    This class groups the items that make up a cryptocurrency, together.
    Behaviours include:
    -addTrade   adds a new trade to the blockChain
    -mine       this performs a mine and sends the mined cryptocurrency to the specified
                investor then adds the mine to the blockChain
    -getID      returns the ID of the cryptocurrency
    -report     prints the details of the cryptocurrency and its blockChain
 */

public class Cryptocurrency extends LinkItem {
    private String name;
    private String currID;
    private int quantity;
    private BlockChain chain;

    public Cryptocurrency(String name, String currID, int quantity) {
        this.name = name;
        this.currID = currID;
        this.quantity = quantity;
        chain = new BlockChain();
    }

    public void addTrade(int amount, Investor receiver, Investor sender) {
        chain.addTransaction(amount, receiver, sender);
    }

    public void mine(int amount, Investor receiver) {
        if (amount <= quantity) {
            receiver.receive(currID, amount);
            quantity -= amount;
            chain.addTransaction(amount, receiver);
        } else {
            System.out.println("ERROR: insufficient cryptocurrency left to mine.");
        }
    }

    @Override
    public String getID() {
        return currID;
    }

    public void report() {
        System.out.println(name + " " + currID + " " + quantity + " un-mined");
        System.out.println("\t" + chain);
    }

    @Override
    public String toString() {
        return name + " " + currID + " " + quantity + " un-mined";
    }
}
