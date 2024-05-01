package problemset;
import java.util.Arrays;
import java.util.Scanner;

public class insertelearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(arr));
        int index;
        while (true) {
            System.out.println("Enter the index where the number should be inserted:");
            index = sc.nextInt();

            if (index >= 0 && index <= size) {
                break;
            }
            System.out.println("Invalid index. Please enter a valid index.");
        }
        System.out.println("Enter the number to be inserted:");
        int number = sc.nextInt();
        int[] updatedArr = new int[size + 1];
        for (int i = 0; i < index; i++) {
            updatedArr[i] = arr[i];
        }
        updatedArr[index] = number;
        for (int i = index; i < size; i++) {
            updatedArr[i + 1] = arr[i];
        }
        System.out.println("Updated array is: " + Arrays.toString(updatedArr));
    }
}
