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


    public void append_int(int n) {
        ListElementInt elem = new ListElementInt();

        elem.setValue(n);

        appendListElement(elem);
    }

    public void addListElementAsHead(ListElementInt elem) {
        if (length == 0) {
            head = elem;
            queue = elem;
        }
        else {
            head.previous = elem;
            elem.next = head;
            head = elem;
        }
        length++;
    }

    public void add_intAsHead(int n) {
        ListElementInt elem = new ListElementInt();

        elem.setValue(n);

        addListElementAsHead(elem);
    }

    public int getHeadValue() {
        return head.getValue();
    }


    public ListElementInt getHead() {
        return head;
    }

    
    public ListElementInt getQueue() {
        return queue;
    }

    public void pop() {
        if (length == 1) {
            head = null;
            queue = null;
        }
        else {
            queue = queue.previous;
            queue.next = null;
        }

        length--;
    }
}
