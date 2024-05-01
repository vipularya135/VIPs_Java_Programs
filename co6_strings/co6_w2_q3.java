package co6_strings;

import java.util.*;

public class co6_w2_q3 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("vip");
        list.add("arya");
        list.add("kva");

        System.out.println("Original list:");
        System.out.println(list);

        LinkedList<String> list1 = new LinkedList<>(list);

        System.out.println("\nCloned list:");
        System.out.println(list1);
    }
}
