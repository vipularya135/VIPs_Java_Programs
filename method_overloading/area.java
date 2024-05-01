package method_overloading;
import java.util.Scanner;

class are {
    int length, width, radius;
    float base, height;

    public are(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public are(int radius) {
        this.radius = radius;
    }

    public are(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea(int length, int width) {
        return length * width;
    }

    public double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(float base, float height) {
        return 0.5 * base * height ;
    }
}

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and width for rectangle:");
        int rectLength = scanner.nextInt();
        int rectWidth = scanner.nextInt();
        are rectangle = new are(rectLength, rectWidth);
        System.out.println("Area of rectangle: " + rectangle.calculateArea(rectLength, rectWidth));

        System.out.println("Enter radius for circle:");
        int circleRadius = scanner.nextInt();
        are circle = new are(circleRadius);
        System.out.println("Area of circle: " + circle.calculateArea(circleRadius));

        System.out.println("Enter base and height for triangle:");
        float triBase = scanner.nextFloat();
        float triHeight = scanner.nextFloat();
        are triangle = new are(triBase, triHeight);
        System.out.println("Area of triangle: " + triangle.calculateArea(triBase, triBase));
    }
}