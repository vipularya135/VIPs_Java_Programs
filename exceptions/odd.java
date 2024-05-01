package exceptions;

public class odd {

    // Method to check if the number is odd
    public static void checkIfEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }

    public static void main(String[] args) {
        try {
            // Testing the method with an odd number
            checkIfEven(7);

            // Testing the method with an even number
            checkIfEven(12);
        } catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// Custom exception class for odd numbers
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}
