public class LinkedList {
    private Node top;

    public LinkedList() {
        top = null;
    }

    public void addItem(LinkItems o) {
        top = new Node(o, top);
    }

    public LinkItems getTopItem() {
        return top.getItem();
    }

    public LinkItems search(String ID) {
        Node curr = top;
        LinkItems result = null;

        while (curr != null && result == null) {
            if (curr.getItem().getID().equals(ID)) {
                result = curr.getItem();
            }
            curr = curr.getNext();
        }

        return result;
    }
}
