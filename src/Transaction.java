public class Transaction {
    private boolean isTrade;
    private int amount;
    private Investor receiver;
    private Investor sender;

    public Transaction(int amount,Investor receiver, Investor sender){
        this.amount =amount;
        this.sender=sender;
        this.receiver =receiver;
        isTrade=true;
    }

    public Transaction(int amount, Investor receiver){
        this.amount =amount;
        this.receiver =receiver;
        isTrade=false;
    }

    public String toString(){
        String result;
        if(isTrade) {
            result = (" Trade: "+ receiver.getID() +" "+ sender.getID()+" "+ amount);
        }else{
            result = (" Mine: "+ receiver.getID() +" "+ amount);
        }
        return result;
    }
}
