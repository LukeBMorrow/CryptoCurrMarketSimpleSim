/*
    LinkedList
    This is a standard linked list class using a standard Node class.
    Behaviours include:
    -addItem        adds a new item to the linked list
    -search         searches for an item in a linked list and returns it (returns null if not found)
 */
public class LinkedList {
    private Node top;

    public LinkedList() {
        top = null;
    }

    public void addItem(LinkItem o) {
        top = new Node(o, top);
    }

    public LinkItem search(String ID) {
        Node curr = top;
        LinkItem result = null;

        while (curr != null && result == null) {
            if (curr.getItem().getID().equals(ID)) {
                result = curr.getItem();
            }
            curr = curr.getNext();
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        Node curr = top;
        while (curr != null) {
            result += curr + "\n\t";
            curr = curr.getNext();
        }
        return result;
    }
}
