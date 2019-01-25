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

    @Override
    public String getID() {
        return currID;
    }

    public void report(){

    }
}
