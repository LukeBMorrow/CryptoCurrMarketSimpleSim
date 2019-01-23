public class Transaction extends LinkItems{
    private String type;
    private int amount;
    private Investor receiver;
    private Investor sender;
    private int prevTransactionHashcode;
    private int hashcode;

    public Transaction(int amount, Investor sender, Investor receiver, int prevTransactionHashcode){
        this.amount =amount;
        this.sender=sender;
        this.receiver =receiver;
        type = "trade";
        this.prevTransactionHashcode=prevTransactionHashcode;
        hashcode = this.hashCode();
    }

    public Transaction(int amount, Investor receiver){
        this.amount =amount;
        this.receiver =receiver;
        type="mine";
    }

    public int getHashcode(){
        return hashcode;
    }

    public String toString(){
        String result;
        if(type.equals("trade")) {
            result = (type +" "+ receiver.getUserID() +" "+ sender.getUserID()+" "+ amount);
        }else{
            result = (type +" "+ receiver.getUserID() +" "+ amount);
        }
        return result;
    }
}
