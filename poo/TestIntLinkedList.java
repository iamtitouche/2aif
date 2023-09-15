public class TestIntLinkedList {
    public static void main(String[] args) {
        ListElementInt element = new ListElementInt();

        element.setValue(3);
        System.out.print(element.getValue() + "\n");

        IntLinkedList list = new IntLinkedList();

        list.appendListElement(element);


        System.out.print(list.getHeadValue() + "\n");
        

    }
}