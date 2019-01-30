/*
    Node
    This class is a standard Node class used in for our LinkedList.
    Behaviours include:
    -getNext    returns the next item in the LinkedList
    -getItem    returns this instances LinkItem
 */
public class Node {
    private LinkItem item;
    private Node next;

    public Node() {
        next = null;
        item = null;
    }

    public Node(LinkItem item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public LinkItem getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "" + item;
    }
}
