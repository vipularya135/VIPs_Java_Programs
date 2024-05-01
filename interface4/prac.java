package interface4;
import java.io.*;

interface Exam {
    void percentage();
}

class Student implements Exam {
    String name;
    int roll_no, mark1, mark2;

    void getStudent(String n, int r, int m1, int m2) { // Corrected method name 'getstudent' to 'getStudent'
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
        percentage(); // Calling the percentage method within display
    }

    public void percentage() {
        double totalMarks = mark1 + mark2;
        double percentage = (totalMarks / 200) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class prac {
    public static void main(String[] args) {
        // Example usage
        Student student1 = new Student();
        student1.getStudent("John", 101, 75, 80);
        student1.display();

        Student student2 = new Student();
        student2.getStudent("Alice", 102, 90, 85);
        student2.display();
    }
}
