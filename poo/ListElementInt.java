public class ListElementInt {
    private int value;
    ListElementInt next;
    ListElementInt previous;


    public void setValue(int n) {
        value = n;
    }

    public int getValue() {
        return value;
    }

    public ListElementInt getNext() {
        return next;
    }

    public ListElementInt getPrevious() {
        return previous;
    }

}
