package collections.lucas;

public class Main {
    public static void main(String args[]) {
        SinglyLinkedList<String> stringSinglyLinkedList = new SinglyLinkedList();
        stringSinglyLinkedList.add("A");
        stringSinglyLinkedList.add("B");
        stringSinglyLinkedList.add("C");

        System.out.println(stringSinglyLinkedList);

        SinglyLinkedList<Integer> integerSinglyLinkedList = new SinglyLinkedList<>();
        integerSinglyLinkedList.add(1);
        integerSinglyLinkedList.add(2);
        integerSinglyLinkedList.add(3);

        System.out.println(integerSinglyLinkedList);

        System.out.println(stringSinglyLinkedList.contains("A"));
        System.out.println(stringSinglyLinkedList.contains("D"));
    }
}
