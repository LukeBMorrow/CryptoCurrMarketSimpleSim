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

    public void addTrade(int amount,Investor receiver, Investor sender){
        chain.addTransaction(amount,receiver,sender);
    }

    public void mine(int amount, Investor receiver){
        if(amount<=quantity){
            receiver.receive(currID,amount);
            chain.addTransaction(amount,receiver);
        }else{
            System.out.println("ERROR: insufficient cryptocurrency left to mine.");
        }
    }

    @Override
    public String getID() {
        return currID;
    }

    public void report(){
        System.out.println(name +" "+ currID +" "+ quantity+" unmined\n");
        System.out.println("\t "+chain);
    }
}
