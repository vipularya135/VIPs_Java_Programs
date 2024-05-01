package exceptions;
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException {
        this.rollNo = rollNo;
        this.name = name;
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        this.age = age;
        this.course = course;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCourse() {
        return course;
    }
}
public class hand {
    public static void main(String[] args) {
        try {
            Student student = new Student(101, "John", 22, "Computer Science");
            System.out.println("Student details: " + student.getRollNo() + ", " + student.getName() + ", " +
                    student.getAge() + ", " + student.getCourse());
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Caught AgeNotWithinRangeException: " + e.getMessage());
        }
    }
}
