import java.util.Scanner;

class jeep {
    String name;
    int year;  // Assuming year is an integer
    String model_name;
    float mileage;

    // method
    void assign(String n, int y, String mn, float m) {
        this.name = n;
        this.year = y;
        this.model_name = mn;
        this.mileage = m;
    }

    void display() {
        System.out.println("Car Name: " + name);
        System.out.println("Model name: " + model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println();
    }
}

public class car {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        // Creating an instance of the Car class
        jeep c1 = new jeep();
        System.out.print("Enter Company Name: ");
        String companyName = ob.nextLine();

        System.out.print("Enter Model Name: ");
        String modelName = ob.nextLine();

        System.out.print("Enter Year: ");
        int year = ob.nextInt();  // Assuming year is entered as an integer

        System.out.print("Enter Mileage: ");
        float mileage = ob.nextFloat();

        c1.assign(companyName, year, modelName, mileage);  // Passing year as an integer
        System.out.println("Car Details:");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        c1.display();

    }
}
