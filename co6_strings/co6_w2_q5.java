package co6_strings;

import java.util.*;

public class co6_w2_q5 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("vip");
        list.add("arya");
        list.add("kva");

        System.out.println("Original list:");
        System.out.println(list);
        list.addFirst("abc");
        System.out.println("List after insertion from beginning");
        System.out.println(list);
        list.addLast("xyz");
        System.out.println("List after insertion from end");
        System.out.println(list);
    }
}
