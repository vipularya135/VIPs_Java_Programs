import java.util.Scanner;
import java.util.Arrays;

public class arrayreverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size];

        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array is:" + Arrays.toString(arr));
        for(int i=size-1;i>=0;i--){
            arr1[size-i-1] = arr[i];
        }
        System.out.println("reversed array is:" + Arrays.toString(arr1));

    }
}
