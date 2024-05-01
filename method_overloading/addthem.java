package method_overloading;
import java.util.Scanner;

class them {
    int a, b, c;
    float d, e;

    public double calculateArea(int a, int b) {
        return a + b;
    }

    public double calculateArea(int a, int b, int c) {
        return a + b + c;
    }

    public double calculateArea(float d, float e) {
        return d + e;
    }
}

public class addthem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        them calculator = new them(); // create an instance of the 'them' class

        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Area: " + calculator.calculateArea(num1, num2));

        System.out.println("Enter three numbers:");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        System.out.println("Area: " + calculator.calculateArea(num3, num4, num5));

        System.out.println("Enter two float numbers:");
        float float1 = scanner.nextFloat();
        float float2 = scanner.nextFloat();
        System.out.println("Area: " + calculator.calculateArea(float1, float2));
    }
}
