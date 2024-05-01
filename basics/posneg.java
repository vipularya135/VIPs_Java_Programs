import java.util.Scanner;

public class posneg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number " + num + " is positive");
        } else {
            System.out.println("Number " + num + " is negative");
        }
    }
}
