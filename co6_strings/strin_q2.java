package co6_strings;

public class strin_q2 {
    public static void main(String[] args) {
        String m1 = "hello";
        String m2 = "GOODBYE";
        String m3 = "spa   ces";

        String replacedM1 = m1.replace('l', 'L');

        String uppercaseM2 = m2.toUpperCase();

        String lowercaseM3 = m3.toLowerCase();
        String tri = m3.trim();

        System.out.println("Original m1: " + m1);
        System.out.println("After replacing 'l' with 'L' in m1: " + replacedM1);
        System.out.println("Original m2: " + m2);
        System.out.println("Uppercase m2: " + uppercaseM2);
        System.out.println("Original m3: " + m3);
        System.out.println("Lowercase m3: " + lowercaseM3);
        System.out.println("trim m3: " + tri);

    }
}
