package abst;
import java.util.Scanner;


abstract class Shape {
    abstract void drawArea();
    abstract void drawPerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void drawArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void drawPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    void drawArea() {
        double s = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        System.out.println("Area of Triangle: " + area);
    }

    void drawPerimeter() {
        double perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();

        System.out.print("Enter the length of side A of the triangle: ");
        double triangleSideA = scanner.nextDouble();

        System.out.print("Enter the length of side B of the triangle: ");
        double triangleSideB = scanner.nextDouble();

        System.out.print("Enter the length of side C of the triangle: ");
        double triangleSideC = scanner.nextDouble();

        Circle circle = new Circle(circleRadius);
        circle.drawArea();
        circle.drawPerimeter();

        Triangle triangle = new Triangle(triangleSideA, triangleSideB, triangleSideC);
        triangle.drawArea();
        triangle.drawPerimeter();

        scanner.close();
    }
}
