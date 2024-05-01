package extra;
public class SumOddEven {
    public static void main(String[] args) {
        // Define variables
        int sumOdd = 0; // Accumulating sum of odd numbers
        int sumEven = 0; // Accumulating sum of even numbers
        int absDiff; // Absolute difference between the two sums

        // Compute sums
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        // Compute Absolute Difference
        absDiff = Math.abs(sumOdd - sumEven);

        // Print sums and absolute difference
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Absolute difference: " + absDiff);
    }
}
