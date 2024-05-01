package interface4;


interface Department {
    void printAttributes();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    Hostel(String name, String location, int rooms) {
        this.hostelName = name;
        this.hostelLocation = location;
        this.numberOfRooms = rooms;
    }

    void printAttributes() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class St extends Hostel implements Department {
    String studentName;
    String regdNo;
    String electiveSubject;
    double avgMarks;

    St(String name, String location, int rooms, String studentName, String regdNo, String electiveSubject, double avgMarks) {
        super(name, location, rooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    void printData() {
        super.printAttributes();
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }

    @Override
    public void printAttributes() {
        System.out.println("Department Name: Computer Science"); // Replace with the actual department name
        System.out.println("Department Head: Prof. XYZ"); // Replace with the actual department head
    }
}

public class co4_w1_q3 {
    public static void main(String[] args) {
        // Create an instance of the Student class
        St student1 = new St("HostelA", "LocationA", 100, "John Doe", "12345", "Mathematics", 85.5);

        // Print the student data and department attributes
        student1.printData();
        student1.printAttributes();
    }
}
