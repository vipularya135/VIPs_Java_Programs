package co6_strings;

import java.util.*;

public class co6_w2_q1 {
    public static void main(String args[]) {
        LinkedList<String>list = new LinkedList<>();
        list.add("vip");
        list.add("arya");
        list.add("kva");
        System.out.println("print using list");
        System.out.println(list);
        System.out.println("\nIterating in reverse order:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
