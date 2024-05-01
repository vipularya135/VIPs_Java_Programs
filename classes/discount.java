package classes;

class Store {
    double purchaseAmount;

    public void setPurchaseAmount(double amount) {
        purchaseAmount = amount;
    }

    public double calculateDiscount() {
        if (purchaseAmount >= 1000) {
            return purchaseAmount * 0.05; // 5% discount
        } else if (purchaseAmount >= 500 && purchaseAmount < 1000) {
            return purchaseAmount * 0.02; // 2% discount
        } else {
            return purchaseAmount * 0.01; // 1% discount
        }
    }

    public void displayFinalAmount() {
        double discount = calculateDiscount();
        double finalAmount = purchaseAmount - discount;

        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Discount: $" + discount);
        System.out.println("Final Amount after Discount: $" + finalAmount);
    }
}

public class discount {
    public static void main(String[] args) {
        // Create an object of Store
        Store myStore = new Store();

        // Set the purchase amount
        myStore.setPurchaseAmount(1200);

        // Display final amount after applying discount
        myStore.displayFinalAmount();
    }
}
