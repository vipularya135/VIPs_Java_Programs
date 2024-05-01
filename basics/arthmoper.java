public class arthmoper {
    public static void main(String args[])
    {
        int a= 1;
        int b=10;

        int add=a+b;
        int sub;
        int mul=a*b;
        int div;
        if(a>b)
        {
            sub=a-b;
            div=a/b;
        } else{
            sub=b-a;
            div=b/a;
        }

        System.out.println("add:"+add);
        System.out.println("sub:"+sub);
        System.out.println("mul:"+mul);
        System.out.println("div:"+div);

    }
}
