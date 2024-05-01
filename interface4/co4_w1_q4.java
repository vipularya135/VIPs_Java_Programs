import java.util.Scanner;

interface ss {
    void enroll();
    void viewResults();
}

class Internal implements ss {
    protected String name;
    protected int id;
    private String department;
    private double gpa;

    public Internal(String name, int id, String department, double gpa) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.gpa = gpa;
    }

    @Override
    public void enroll() {
        System.out.println("Enrolling internal student " + name);
    }

    @Override
    public void viewResults() {
        System.out.println("Internal student " + name + " has GPA: " + gpa);
    }
}

interface External extends ss {
    void enrollExternal();
}

class Result extends Internal implements External {
    private String program;
    private String institution;

    public Result(String name, int id, String department, double gpa, String program, String institution) {
        super(name, id, department, gpa);
        this.program = program;
        this.institution = institution;
    }

    @Override
    public void enrollExternal() {
        System.out.println("Enrolling external student " + name);
    }

    @Override
    public void viewResults() {
        System.out.println("External student " + name + " from " + institution);
    }
}

public class co4_w1_q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter internal student details (name, id, department, GPA):");
        String internalName = scanner.next();
        int internalId = scanner.nextInt();
        String internalDept = scanner.next();
        double internalGPA = scanner.nextDouble();

        System.out.println("Enter external student details (name, id, program, institution):");
        String externalName = scanner.next();
        int externalId = scanner.nextInt();
        String externalProgram = scanner.next();
        String externalInstitution = scanner.next();

        scanner.close();

        Result internalStudent = new Result(internalName, internalId, internalDept, internalGPA, "", "");
        Result externalStudent = new Result(externalName, externalId, "", 0.0, externalProgram, externalInstitution);

        internalStudent.enroll();
        internalStudent.viewResults();

        externalStudent.enrollExternal();
        externalStudent.viewResults();
    }
}
