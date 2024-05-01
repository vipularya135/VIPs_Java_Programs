import java.util.Scanner;

public class numsum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int a;
        int sum=0;
        for(a=1; a<=num;a++){
            sum= sum + a;
        }
        System.out.println("sum of numbers is:"+ sum);
    }
}
