public class Block extends Node {
    private int hashCode;
    private Transaction transaction;
    private Block next;

    public Block(Transaction item, Block next) {
        this.transaction = item;
        this.next = next;
        hashCode = this.hashCode();
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public int getHashCode() {
        return hashCode;
    }
}
