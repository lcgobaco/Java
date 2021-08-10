package collections.lucas;

public class SinglyLinkedList<T> {

    private Node head;
    private Node tail;

    public Node add(T value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        return node;
    }

    public String toString() {
        Node walk = head;
        String result = "";
        while (walk != null) {
            result += walk.value;
            walk = walk.next;
        }
        return result;
    }

    public static void main(String args[]) {
    }

    public Boolean contains(String a) {
        Node walk = head;
        while (walk != null) {
            if (walk.value == a) {
                return true;
            }
            walk = walk.next;
        }
        return false;
    }
}
