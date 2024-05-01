class Bill {
    double local;
    double isd;
    double net;
    // Default constructor
    Bill() {
        local = 1;
        isd = 1;
        net = 500;
    }


    // Parameterized constructor
    Bill(double l, double i, double n) {
        local = l;
        isd = i;
        net = n;
    }


    double total() {
        return local + isd + net;
    }
}


public class netbill {
    public static void main(String[] args) {
        // Using default constructor
        Bill b1 = new Bill();
        double final1 = b1.total();
        System.out.println("Default Bill of user1 is: " + final1);


        // Using parameterized constructor
        Bill b2 = new Bill(10, 20, 30);
        double final2 = b2.total();
        System.out.println("Bill of user2 is: " + final2);
    }
}