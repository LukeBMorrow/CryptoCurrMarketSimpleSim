public class Node {
    private LinkItem item;
    private Node next;

    public Node(){
        next=null;
        item=null;
    }
    public Node(LinkItem item, Node next){
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
        return ""+item;
    }
}
