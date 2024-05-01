package multi_threading;

class multi3 extends Thread{
    public void run(){
        System.out.println("thread is running raa");
    }
}
public class multiple_threads_1 {
    public static void main(String args[]) {
        multi3 m1 = new multi3();
        multi3 m2 = new multi3();
        multi3 m3 = new multi3();
        System.out.println("name of t1:" + m1.getName());
        System.out.println("id of t1:" + m1.getId());

        System.out.println("name of t2:" + m2.getName());
        System.out.println("id of t1:" + m1.getId());
        m1.start();
        m2.start();
        m3.setName("sonu");
        System.out.println("name of m3, i changed:" + m3.getName());


    }
}
