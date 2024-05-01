package co6_strings;

import java.util.*;

public class linkedlist {
    public static void main(String args[]) {
        LinkedList<String>list = new LinkedList<>();
        list.add("vip");
        list.add("arya");
        list.add("kva");
        System.out.println("print using list");
        System.out.println(list);

        System.out.println("print using iterator");
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("print after removing");
        list.remove("kva");
        System.out.println(list);

    }
}
