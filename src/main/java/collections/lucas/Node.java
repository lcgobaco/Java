package collections.lucas;

public class Node<T> {
    T value;
    Node next;

    /*
    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }
     */

    public Node(T value) {
        this.value = value;
    }
}
