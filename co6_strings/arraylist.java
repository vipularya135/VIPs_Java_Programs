package co6_strings;
import java.util.*;

public class arraylist {
    public static void main(String args[]) {
        ArrayList<String>list = new ArrayList<String>();
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
    }
}
