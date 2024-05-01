package extra;
public class CozaLozaWoza {
    public static void main(String[] args) {
        final int LOWERBOUND = 1, UPPERBOUND = 110;
        boolean flag = false; // Flag to keep track of whether the number has been processed

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            flag = false; // Reset the flag for each iteration

            // Print "Coza" if number is divisible by 3
            if (number % 3 == 0) {
                System.out.print("Coza");
                flag = true;
            }
            // Print "Loza" if number is divisible by 5
            if (number % 5 == 0) {
                System.out.print("Loza");
                flag = true;
            }
            // Print "Woza" if number is divisible by 7
            if (number % 7 == 0) {
                System.out.print("Woza");
                flag = true;
            }

            // Print the number if it is not divisible by 3, 5, and 7 (i.e., it has not been processed above)
            if (!flag) {
                System.out.print(number);
            }

            // Print a newline if number is divisible by 11; else print a space
            if (number % 11 == 0) {
                System.out.println(); // print newline
            } else {
                System.out.print(" "); // print a space
            }
        }
    }
}
