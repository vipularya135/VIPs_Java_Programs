package constructor;

class Box {
    double width;
    double height;
    double depth;

    // Parameterized constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class volu {
    public static void main(String args[]) {
        // Using parameterized constructor
        Box b1 = new Box(10, 20, 30);
        double vol1 = b1.volume();
        System.out.println("Volume of box1 is: " + vol1);

        // Using parameterized constructor with different values
        Box b2 = new Box(20, 30, 40);
        double vol2 = b2.volume();
        System.out.println("Volume of box2 is: " + vol2);
    }
}
