package constructor;

class Restaurent {
    String name;
    float rating;
    String contacts;
    String address;

    // Parameterized constructor
    Restaurent(String n, float r, String c, String a) {
        this.name = n;
        this.rating = r;
        this.contacts = c;
        this.address = a;
    }

    // Default constructor
    Restaurent() {
        name = "Default Restaurant";
        rating = 5;
        contacts = "Default Contact";
        address = "Default Address";
    }

    void display() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Restaurant Rating: " + rating);
        System.out.println("Restaurant Contact: " + contacts);
        System.out.println("Restaurant Address: " + address);
        System.out.println();
    }
}

public class hotel {
    public static void main(String[] args) {
        Restaurent r1 = new Restaurent("VIP", 54, "srfdz", "dtrf");
        Restaurent r2 = new Restaurent(); // Using default constructor

        r1.display();
        r2.display();
    }
}
