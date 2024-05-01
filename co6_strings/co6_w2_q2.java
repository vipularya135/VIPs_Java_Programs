package co6_strings;

import java.util.*;

public class co6_w2_q2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        System.out.println("Linked List:");
        displayLinkedList(linkedList);

        linkedList.add(2, "Grapes");
        System.out.println("\nAfter adding 'Grapes' at position 2:");
        displayLinkedList(linkedList);

        linkedList.remove(1);
        System.out.println("\nAfter removing element at position 1:");
        displayLinkedList(linkedList);
    }

    public static void displayLinkedList(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}
