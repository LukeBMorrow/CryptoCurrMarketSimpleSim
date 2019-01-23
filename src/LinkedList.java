public class LinkedList {
    private Node top;

    public LinkedList() {
        top = null;
    }

    public void addItem(LinkItems o) {
        top = new Node(o, top);
    }

    public LinkItems getTopItem(){
        return top.getItem();
    }

    public LinkItems search(String ID) {
        Node curr = top;
        LinkItems result = null;

        if (top!=null && top.getItem() instanceof Investor) {
            while (curr != null && result == null) {
                if (((Investor) curr.getItem()).getUserID().equals(ID)) {
                    result = curr.getItem();
                }
                curr = curr.getNext();
            }
        }
        return result;
    }
}
