import java.util.Scanner;

public class switchoper {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("enter the operation to be done: (choose one among: plus, diff, mul, div)");
        String oper = sc.next();
        switch (oper) {
            case "plus":
                int sum = num1 + num2;
                System.out.println("sum of the numbers are: " + sum);
                break;
            case "diff":
                if (num1 > num2) {
                    int diff = num1 - num2;
                    System.out.println("difference of the numbers are: " + diff);
                } else {
                    int diff = num2 - num1;
                    System.out.println("difference of the numbers are: " + diff);
                }
                break;
            case "mul":
                int mul = num1 * num2;
                System.out.println("product of the numbers are: " + mul);
                break;
            case "div":
                if (num1 > num2) {
                    int div = num1 / num2;
                    System.out.println("division of the numbers are: " + div);
                } else {
                    int div = num2 / num1;
                    System.out.println("division of the numbers are: " + div);
                }
                break;
            default:
                System.out.println("invalid");
        }
    }
}
