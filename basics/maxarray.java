import java.util.Scanner;
import java.util.Arrays;

public class maxarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array is:" + Arrays.toString(arr));
        int min = arr[0];
        int minIndex = 0;
        for(int i=0;i<size;i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("min element is:" + arr[minIndex]);
    }
}