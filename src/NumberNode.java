public class NumberNode {
    private NumberNode next;
    private int value;

    public NumberNode(int value) {
        this.value = value;
    }

    public NumberNode getNext() {
        return next;
    }

    public void setNext(NumberNode next) {
        this.next = next;
    }

}
