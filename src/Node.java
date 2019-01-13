public class Node {
    private Object item;
    private Node next;

    public Node(Object item, Node next){
        this.item = item;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Object getItem() {
        return item;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
