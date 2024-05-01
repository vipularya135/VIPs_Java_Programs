import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter a number in the range (0 - 1000): ");
            num = sc.nextInt();
            if (num >= 0 && num <= 1000) {
                break;
            } else {
                System.out.println("Please enter a valid integer between 0 and 1000.");
            }
        }
        int sum = 0;
        int originalNumber = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of all digits in " + originalNumber + " is " + sum);
    }
}
