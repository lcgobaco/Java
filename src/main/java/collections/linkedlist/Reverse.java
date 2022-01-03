package collections.linkedlist;

public class Reverse {

    static Node reverse(Node head) {
        return reverse2(head);
    }

    static Node reverse1(Node head) {
        if (head == null || head.ptr == null) {
            return head;
        }
        Node prev = null;
        Node next = head.ptr;
        while (next != null) {
            head.ptr = prev;
            prev = head;
            head = next;
            next = next.ptr;
        }
        head.ptr = prev;
        return head;
    }

    static Node reverse2(Node head) {
        if (head == null || head.ptr == null) {
            return head;
        }
        Node prev = null;
        Node next = head.ptr;
        do {
            head.ptr = prev;
            prev = head;
            head = next;
            next = next.ptr;
        } while (next != null);
        head.ptr = prev;
        return head;
    }


    static void print(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.ptr;
        }
    }
}
