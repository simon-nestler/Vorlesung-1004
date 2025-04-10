public class NumberList {
    private NumberNode head;

    public NumberList() {

    }

    public void add(int value) {
        NumberNode newNode = new NumberNode(value);

        if (head == null) {
            head = newNode;
        } else {
            NumberNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public int getFrequency(int value) {
        int result = 0;
        NumberNode current = head;

        while (current != null) {
            if (value == current.getValue()) {
                result++;
            }
            current = current.getNext();
        }

        return result;
    }

    public String toString() {
        String result = "Die Liste: ";
        NumberNode current = head;

        while (current != null) {
            result += current.getValue() + " ";
            current = current.getNext();
        }

        return result.trim();
    }
}
