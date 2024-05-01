package overriding;
import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class tria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the rectangle:");
        System.out.print("Length: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Width: ");
        double rectangleWidth = scanner.nextDouble();

        System.out.println("\nEnter the radius of the circle:");
        System.out.print("Radius: ");
        double circleRadius = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        Circle circle = new Circle(circleRadius);

        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());

        scanner.close();
    }
}
