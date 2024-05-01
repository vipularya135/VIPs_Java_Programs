package classes;

class Employee {
    String name;
    String address;
    double basicSalary;

    Employee(String name, String address, double basicSalary) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
    }

    void generatePerformanceReport(String performance) {
        System.out.println("Performance Report for " + name + ": " + performance);
    }

    double calculateSalary() {
        return basicSalary + calculateHRA() + calculateDA() + calculateBonus();
    }

    double calculateHRA() {
        return 0.12 * basicSalary;
    }

    double calculateDA() {
        return 0.07 * basicSalary;
    }

    double calculateBonus() {
        return 0;  // Default bonus implementation, subclasses can override
    }
}

class Teacher extends Employee {
    Teacher(String name, String address) {
        super(name, address, 30000);
    }
}

class Lecturer extends Employee {
    Lecturer(String name, String address) {
        super(name, address, 40000);
    }
}

class Professor extends Employee {
    Professor(String name, String address) {
        super(name, address, 50000);
    }

    @Override
    double calculateBonus() {
        return 0.02 * basicSalary;
    }
}

public class sup {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John Doe", "123 Main St");
        Lecturer lecturer = new Lecturer("Alice Smith", "456 Oak St");
        Professor professor = new Professor("Bob Johnson", "789 Elm St");

        // Display basic information
        System.out.println("classes.Teacher Information:");
        System.out.println("Name: " + teacher.name);
        System.out.println("Address: " + teacher.address);
        System.out.println("Salary: " + teacher.calculateSalary());

        System.out.println("\nclasses.Lecturer Information:");
        System.out.println("Name: " + lecturer.name);
        System.out.println("Address: " + lecturer.address);
        System.out.println("Salary: " + lecturer.calculateSalary());

        System.out.println("\nclasses.Professor Information:");
        System.out.println("Name: " + professor.name);
        System.out.println("Address: " + professor.address);
        System.out.println("Salary: " + professor.calculateSalary());

        // Generate performance reports
        teacher.generatePerformanceReport("Good");
        lecturer.generatePerformanceReport("Excellent");
        professor.generatePerformanceReport("Satisfied");
    }
}
