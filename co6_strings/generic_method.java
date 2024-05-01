package co6_strings;

public class generic_method {
    static class Tests {
        static <T> void display(T... elements) {
            for (T element : elements) {
                System.out.println(element.getClass().getName() + "= " + element);
            }
        }
    }

    public static void main(String args[]) {
        Tests.display(11);
        Tests.display("vip");
        Tests.display(1, 0);
        Tests.display("vipul", "arya");
    }
}
