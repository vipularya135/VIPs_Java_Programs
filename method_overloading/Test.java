package method_overloading;
class Employee {
    String name, jobTitle;
    double basic, hra, da, incentive;

    Employee() {
        System.out.println("Akshay got loss of pay");
    }

    Employee(String jobTitle, double basic, double hra, double da, double incentive) {
        this.jobTitle = jobTitle;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.incentive = incentive;
    }

    Employee(String jobTitle, double basic, double hra, double da) {
        this.jobTitle = jobTitle;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }

    void salary() {
        System.out.println("worst Employee" );
    }
    void salary(String name, String message) {
        double grossSalary = basic + (basic * hra) + (basic * da) + incentive;
        System.out.println("Employee " + name + " (" + jobTitle + ") got incentive");
        System.out.println("Gross Salary: Rs. " + grossSalary);
    }

    void salary(String name) {
        double grossSalary = basic + (basic * hra) + (basic * da);
        System.out.println("Employee " + name + " (" + jobTitle + ")");
        System.out.println("Gross Salary: Rs. " + grossSalary);
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("parameterized constructor/method");
        Employee ob1 = new Employee("Engineer", 50000, 0.12, 0.05, 1500);
        ob1.salary("Aditya", "got incentive");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("overloaded constructor/method");
        Employee ob2 = new Employee("Doctor", 50000, 0.12, 0.05);
        ob2.salary("Arun");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("default constructor/method");
        Employee ob3 = new Employee();
        ob3.salary();
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
    }
}
