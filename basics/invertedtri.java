import java.util.Scanner;
public class invertedtri {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int numRows = sc.nextInt();
        for (int i = numRows; i >= 1; i--) {
            for (int j = numRows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
