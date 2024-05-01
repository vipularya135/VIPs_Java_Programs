package Inheritance;
import java.util.Scanner;

class student {
    int rollno;
    String name, dept, college;

    void insert(int r, String n, String d, String c) {
        rollno = r;
        name = n;
        dept = d;
        college = c;
    }
}

class test extends student {
    int[] m = {80, 89, 87, 86, 90};
    double avg, total = 0;

    void markdetails() {
        for (int mark : m) {
            total += mark;
        }
        avg = total / m.length;
    }
}

class sports extends test {
    String sname, winner, runner, teamNo;

    void display() {
        System.out.println("Details : ");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("College: " + college);

        System.out.println("\nTest Details:");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);

        System.out.println("\nSports Details:");
        System.out.println("Sport Name: " + sname);
        System.out.println("Winner: " + winner);
        System.out.println("Runner: " + runner);
        System.out.println("Team No: " + teamNo);
    }
}

public class stude {
    public static void main(String args[]) {
        sports ob = new sports();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter College: ");
        String college = scanner.nextLine();

        ob.insert(rollNo, name, dept, college);
        ob.markdetails();

        System.out.print("Enter Sport Name: ");
        ob.sname = scanner.nextLine();
        System.out.print("Enter Winner: ");
        ob.winner = scanner.nextLine();
        System.out.print("Enter Runner: ");
        ob.runner = scanner.nextLine();
        System.out.print("Enter Team No: ");
        ob.teamNo = scanner.nextLine();

        ob.display();
        scanner.close();
    }
}
