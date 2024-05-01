package Inheritance;
class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    void calculateSalary() {
    }

    void calculateBonus() {
        System.out.println("Bonus: " + 0.02 * getBasicSalary());
    }

    void generatePerformanceReport() {
    }

    double getBasicSalary() {
        return 0;
    }
}

class Teacher extends Employee {
    Teacher(String name) {
        super(name, "Teacher");
    }

    @Override
    void calculateSalary() {
        this.salary = getBasicSalary() + 0.12 * getBasicSalary() + 0.07 * getBasicSalary();
        System.out.println("Salary for " + jobTitle + " " + name + ": " + salary);
    }

    @Override
    double getBasicSalary() {
        return 30000;
    }

    @Override
    void generatePerformanceReport() {
        System.out.println("Performance Report: Excellent");
    }
}

class Lecturer extends Employee {
    Lecturer(String name) {
        super(name, "Lecturer");
    }

    @Override
    void calculateSalary() {
        this.salary = getBasicSalary() + 0.12 * getBasicSalary() + 0.07 * getBasicSalary();
        System.out.println("Salary for " + jobTitle + " " + name + ": " + salary);
    }

    @Override
    double getBasicSalary() {
        return 40000;
    }

    @Override
    void generatePerformanceReport() {
        System.out.println("Performance Report: Good");
    }
}

class Professor extends Employee {
    Professor(String name) {
        super(name, "Professor");
    }

    @Override
    void calculateSalary() {
        this.salary = getBasicSalary() + 0.12 * getBasicSalary() + 0.07 * getBasicSalary();
        System.out.println("Salary for " + jobTitle + " " + name + ": " + salary);
    }

    @Override
    double getBasicSalary() {
        return 50000;
    }

    @Override
    void generatePerformanceReport() {
        System.out.println("Performance Report: Satisfied");
    }
}

public class employ {
    public static void main(String args[]) {
        Teacher teacher = new Teacher("John");
        teacher.calculateSalary();
        teacher.calculateBonus();
        teacher.generatePerformanceReport();

        Lecturer lecturer = new Lecturer("Jane");
        lecturer.calculateSalary();
        lecturer.calculateBonus();
        lecturer.generatePerformanceReport();

        Professor professor = new Professor("Smith");
        professor.calculateSalary();
        professor.calculateBonus();
        professor.generatePerformanceReport();
    }
}
