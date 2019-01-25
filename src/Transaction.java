public class Transaction {
    private String type;
    private int amount;
    private Investor receiver;
    private Investor sender;

    public Transaction(int amount,Investor receiver, Investor sender){
        this.amount =amount;
        this.sender=sender;
        this.receiver =receiver;
        type = "trade";
    }

    public Transaction(int amount, Investor receiver){
        this.amount =amount;
        this.receiver =receiver;
        type="mine";
    }

    public String toString(){
        String result;
        if(type.equals("trade")) {
            result = (type +" "+ receiver.getID() +" "+ sender.getID()+" "+ amount);
        }else{
            result = (type +" "+ receiver.getID() +" "+ amount);
        }
        return result;
    }
}
