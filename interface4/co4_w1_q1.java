package interface4;
import java.io.*;
abstract class Studen {
    String name;
    int roll_no, mark1, mark2;

    void getStudent(String n, int r, int m1, int m2) {
        name = n;
        roll_no = r;
        mark1 = m1;
        mark2 = m2;
    }

    void display() {
        System.out.println("Name of Student: " + name);
        System.out.println("Roll No. of Student: " + roll_no);
        System.out.println("Marks of Subject 1: " + mark1);
        System.out.println("Marks of Subject 2: " + mark2);
    }

    // Abstract method to be implemented by subclasses
    abstract void percentage();
}

class Result extends Studen {
    @Override
    void percentage() {
        double totalMarks = mark1 + mark2;
        double percentage = (totalMarks / 200) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class co4_w1_q1 {
    public static void main(String[] args) {
        // Example usage
        Result student1 = new Result();
        student1.getStudent("John", 101, 75, 80);
        student1.display();
        student1.percentage();

        Result student2 = new Result();
        student2.getStudent("Alice", 102, 90, 85);
        student2.display();
        student2.percentage();
    }
}
