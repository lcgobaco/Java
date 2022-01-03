package collections.linkedlist;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> linkedList = new LinkedList<>();

        // as a stack
        linkedList.push(1435);
        linkedList.push(35);
        linkedList.push(75);
        System.out.println(linkedList.pop());

        linkedList.clear();
        // as a queue
        linkedList.add(1435);
        linkedList.add(35);
        linkedList.add(75);
        System.out.println(linkedList.poll());
    }
}
