public class Cryptocurrency extends LinkItems {
    private String name;
    private String currID;
    private int quantity;
    private BlockChain chain;

    public Cryptocurrency(String name, String currID, int quantity) {
        this.name = name;
        this.currID = currID;
        this.quantity = quantity;
        chain = new BlockChain(currID);
    }

    public String getID() {
        return currID;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int ammount, Investor reciever) {

    }
}
