// File name: employee.java

class sal {
    // Attributes
    String name;
    String jobTitle;
    double basicSalary;

    // Default Constructor
    sal() {
        this.name = "Unknown";
        this.jobTitle = "Unspecified";
        this.basicSalary = 50000; // Default basic salary
    }

    // Parameterized Constructor
    sal(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = 50000; // Default basic salary
    }

    // Overloaded Constructor
    sal(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        double hra = 0.12 * basicSalary;  // HRA is 12% of basic
        double da = 0.05 * basicSalary;   // DA is 5% of basic
        return basicSalary + hra + da;    // Gross salary calculation
    }

    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("Gross Salary: Rs. " + calculateSalary());
    }
}

public class employee {
    public static void main(String[] args) {
        // Creating instances of the Employee class using different constructors
        sal employee1 = new sal();
        sal employee2 = new sal("John Doe", "Software Engineer");
        sal employee3 = new sal("Jane Smith", "Manager", 60000);

        // Displaying employee details
        employee1.displayDetails();
        System.out.println();
        employee2.displayDetails();
        System.out.println();
        employee3.displayDetails();
    }
}
