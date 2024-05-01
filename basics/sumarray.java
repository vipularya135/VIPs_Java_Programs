import java.util.Arrays;
import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int size = sc.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter elements for Array 1:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter elements for Array 2:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array2[i] = sc.nextInt();
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = array1[i] + array2[i];
        }
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Sum Array: " + Arrays.toString(result));
    }
}
