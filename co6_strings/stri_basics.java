package co6_strings;

public class stri_basics {
    public static void main(String[] args) {
        String m1 = "this is a test. This is a test. This is a test?";
        int leng = m1.length();
        char tell = m1.charAt(6);
        String sub = m1.substring(26, 32);
        int indexOfA = m1.indexOf('a');
        int indexOfIBM = m1.indexOf("IBM");


        System.out.println("Length of the string: " + leng);
        System.out.println("Character at index 6: " + tell);
        System.out.println("Substring from index 26 to 31: " + sub);
        System.out.println("Index of 'a': " + indexOfA);
        System.out.println("Index of 'ibm': " + indexOfIBM);

    }
}
