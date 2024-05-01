import java.util.Scanner;

class ScannetTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll no:");
        int roll = sc.nextInt();
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your fee:");
        double fee = sc.nextDouble();
        sc.close();
    }
}
