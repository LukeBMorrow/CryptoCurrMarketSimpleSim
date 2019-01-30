/*
    Block
    This class is mostly the same as Node, but allows for transaction pairing with
    a hashCode.

*/
public class Block extends Node {
    private int hashCode;
    private Transaction transaction;
    private Block next;

    public Block(Transaction item, Block next) {
        this.transaction = item;
        this.next = next;
        hashCode = this.hashCode();
    }

    @Override
    public Block getNext() {
        return next;
    }

    @Override
    public String toString() {
        return hashCode+"     \t"+transaction;
    }
}
