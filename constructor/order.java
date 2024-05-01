package constructor;
class Constructors2 {
    int orderId;
    String orderedFoods;
    String status;

    Constructors2() {
        this.status = "ordered";
    }
    Constructors2(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.status = "ordered";
    }
    int getOrderId() {
        return orderId;
    }
    String getOrderedFoods() {
        return orderedFoods;
    }
    String getStatus() {
        return status;
    }
}



public class order{
    public static void main(String[] args) {
        Constructors2 order1 = new Constructors2();
        System.out.println("Status of order1: " + order1.getStatus());

        // Create an object using the parameterized constructor
        Constructors2 order2 = new Constructors2(123, "Burger, Fries, Coke");
        System.out.println("Order ID of order2: " + order2.getOrderId());
        System.out.println("Ordered Foods of order2: " + order2.getOrderedFoods());
        System.out.println("Status of order2: " + order2.getStatus());
    }
}
