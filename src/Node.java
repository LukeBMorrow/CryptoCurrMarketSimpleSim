public class Node {
    private LinkItems item;
    private Node next;

    public Node(LinkItems item, Node next){
        this.item = item;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public LinkItems getItem() {
        return item;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
