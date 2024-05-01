class Vehicle {
    String make, model;
    int year;
    String fuelType;

    void fuelEfficiency(double distance, double fuelConsumed) {
        System.out.println("Fuel Efficiency: " + (distance / fuelConsumed) + " km/l");
    }

    void mileage(double distance, double fuelConsumed) {
        System.out.println("Mileage: " + (distance / fuelConsumed) + " km/l");
    }
}

class Bike extends Vehicle {
    void initialize(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        System.out.println("Bike: " + make + " " + model);
    }
}

class Car extends Vehicle {
    void initialize(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        System.out.println("Car: " + make + " " + model);
    }
}

class Van extends Vehicle {
    void initialize(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        System.out.println("Van: " + make + " " + model);
    }
}

public class vehicle_problemset {
    public static void main(String args[]) {
        Bike bike = new Bike();
        bike.initialize("Suzuki", "XXX", 2022, "Petrol");
        bike.fuelEfficiency(250.0, 10.0);
        bike.mileage(20, 1);

        Car car = new Car();
        car.initialize("Toyota", "Camry", 2022, "Petrol");
        car.fuelEfficiency(300.0, 15.0);
        car.mileage(25, 1);

        Van van = new Van();
        van.initialize("Ford", "Transit", 2022, "Diesel");
        van.fuelEfficiency(350.0, 20.0);
        van.mileage(18, 1);
    }
}
