public class TestIntLinkedList {
    public static void main(String[] args) {
        ListElementInt element = new ListElementInt();

        element.setValue(3);
        System.out.print(element.getValue() + "\n");

        IntLinkedList list = new IntLinkedList();

        list.appendListElement(element);


        System.out.print(list.getHeadValue() + "\n");

        list.append_int(4);

        System.out.print(list.getHead().getNext().getValue() + "\n");

        list.pop();

        System.out.print(list.getQueue().getValue() + "\n");
    }
}