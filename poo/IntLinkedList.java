public class IntLinkedList {
    private ListElementInt head;
    private ListElementInt queue;
    private int length = 0;

    public void appendListElement(ListElementInt elem) {
        if (length == 0) {
            head = elem;
            queue = elem;
        }
        else {
            queue.next = elem;
            elem.previous = queue;
            queue = elem;
        }
        length += 1;
    }

    public int getHeadValue() {
        return head.getValue();
    }
}