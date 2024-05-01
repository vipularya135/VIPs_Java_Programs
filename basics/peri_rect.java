import java.util.Scanner;
public class peri_rect {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the rectangle:");
        int len = sc.nextInt();
        System.out.println("enter the width of the rectangle:");
        int wide = sc.nextInt();
        int peri = 2* (len + wide);
        System.out.println("perimeter of the rectangle is:" + peri);

    }
}
