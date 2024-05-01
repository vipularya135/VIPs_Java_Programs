package constructor;

class sample {
    int rollno;
    String name;
    int age;

    // Default constructor
    sample() {
    }

    // Parameterized constructor
    sample(int r, String n, int a) {
        rollno = r;
        name = n;
        age = a;
    }
    sample(int r, int a) {
        rollno = 2345;
        age = 6543;
    }

    // Method to display details
    void display() {
        System.out.println("name is: " + name + ", rollno is: " + rollno + ", age is: " + age);
    }

    // Method to insert values into the object
    void insert(int r, String n, int a) {
        rollno = r;
        name = n;
        age = a;
    }
}

public class stud {
    public static void main(String args[]) {
        // Creating instances of the sample class using different approaches
        sample ob = new sample();          // Default constructor
        sample ob1 = new sample();         // Default constructor
        sample ob2 = new sample(1, "wefg", 12);  // Parameterized constructor
        sample ob3 = new sample(1, 12);  // Parameterized constructor
        sample ob5 = new sample();  // Parameterized constructor


        // Setting values for the first student using direct assignment
        ob.rollno = 86;
        ob.name = "vip";
        ob.age = 20;

        // Displaying details of the first student
        System.out.println("Details of user1");
        ob.display();

        // Using the insert method to set values for the second student
        ob1.insert(12, "dhfv", 67);

        // Displaying details of the second student
        System.out.println("Details of user2");
        ob1.display();

        // Displaying details of the third student (initialized using parameterized constructor)
        System.out.println("Details of user3");
        ob2.display();
        System.out.println("Details of user4");
        ob3.display();
        System.out.println("Details of user5");
        ob5.display();


    }
}
