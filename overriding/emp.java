package overriding;
import java.util.Scanner;

class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    double calculateSalary() {
        // Default implementation (can be overridden by subclasses)
        return 0.0;
    }
}

class HeadIT extends Employee {
    double bonusPercentage;

    HeadIT(String name, int employeeId, double bonusPercentage) {
        super(name, employeeId);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    double calculateSalary() {
        // Salary calculation for HeadIT (including bonus)
        return 50000 + (bonusPercentage / 100) * 50000;
    }
}

class Programmer extends Employee {
    int codingHours;

    Programmer(String name, int employeeId, int codingHours) {
        super(name, employeeId);
        this.codingHours = codingHours;
    }

    @Override
    double calculateSalary() {
        // Salary calculation for Programmer (based on coding hours)
        return 2000 * codingHours;
    }
}

public class emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating HeadIT employee
        System.out.println("Enter details for HeadIT employee:");
        System.out.print("Name: ");
        String headITName = scanner.nextLine();
        System.out.print("Employee ID: ");
        int headITId = scanner.nextInt();
        System.out.print("Bonus Percentage: ");
        double headITBonusPercentage = scanner.nextDouble();

        HeadIT headITEmployee = new HeadIT(headITName, headITId, headITBonusPercentage);

        // Creating Programmer employee
        System.out.println("\nEnter details for Programmer employee:");
        scanner.nextLine(); // Consume the newline character
        System.out.print("Name: ");
        String programmerName = scanner.nextLine();
        System.out.print("Employee ID: ");
        int programmerId = scanner.nextInt();
        System.out.print("Coding Hours: ");
        int programmerCodingHours = scanner.nextInt();

        Programmer programmerEmployee = new Programmer(programmerName, programmerId, programmerCodingHours);

        // Displaying salary for each employee
        System.out.println("\nSalary details:");
        System.out.println("HeadIT Employee - " + headITEmployee.name + ": $" + headITEmployee.calculateSalary());
        System.out.println("Programmer Employee - " + programmerEmployee.name + ": $" + programmerEmployee.calculateSalary());

        scanner.close();
    }
}
