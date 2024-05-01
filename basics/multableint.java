import java.util.Arrays;
import java.util.Scanner;

public class multableint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        System.out.println("multiplication table of" + num + "is:");
        for(int i=0;i<=10;i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}
