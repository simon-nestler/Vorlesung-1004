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

    public boolean remove(int index) {
        int ind = 0;

        if (head == null) {
            return false;
        } else {
            if (index == 0) {
                head = head.getNext();
                return true;
            }

            NumberNode current = head;
            NumberNode previous = null;

            while (current != null && ind < index) {
                previous = current;
                current = current.getNext();
                ind++;
                System.out.println("Current: " + current.getValue());
            }

            if (current != null) {
                previous.setNext(current.getNext());
                return true;
            }
        }

        return false;
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
