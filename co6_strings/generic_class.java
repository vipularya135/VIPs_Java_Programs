package co6_strings;

class test<T,U> {
    T m1;
    U m2;
    test(T m1, U m2) {
        this.m1 = m1;
        this.m2 = m2;
    }
    void print() {
        System.out.println(m1);
        System.out.println(m2);
    }
}

public class generic_class {
    public static  void main(String args[]) {
        test <String, Integer>obj = new test<String, Integer>("hello", 34);
        obj.print();

    }
}
