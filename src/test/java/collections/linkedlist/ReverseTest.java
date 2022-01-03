package collections.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void reverse() {
        Node four = new Node(4, null);
        Node three = new Node(3, four);
        Node two = new Node(2, three);
        Node one = new Node(1, two);
        //Reverse.print(one);
        Node reversed = Reverse.reverse(one);
        //Reverse.print(reversed);

        assertEquals(4, reversed.value);
        assertEquals(3, reversed.ptr.value);
        assertEquals(2, reversed.ptr.ptr.value);
        assertEquals(1, reversed.ptr.ptr.ptr.value);
        assertEquals(null, reversed.ptr.ptr.ptr.ptr);
    }
}