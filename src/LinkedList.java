public class LinkedList {
    private Node top;

    public LinkedList() {
        top = null;
    }

    public void addItem(Object o) {
        top = new Node(o, top);
    }

    public Object getTopItem(){
        return top.getItem();
    }

    public Object search(String ID) {
        Node curr = top;
        Object result = null;

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
