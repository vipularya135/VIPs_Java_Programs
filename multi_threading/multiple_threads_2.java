package multi_threading;


class multi4 extends Thread{
    public void run(){
        System.out.println("thread is running raa");
        for(int i=0; i<6 ; i++){
            System.out.println("thread name : " + Thread.currentThread().getName());

        }
    }
}
public class multiple_threads_2 {
    public static void main(String args[]) {
        multi4 m1 = new multi4();
        multi4 m2 = new multi4();
        multi4 m3 = new multi4();

        m1.start();
        m2.start();
        m3.start();

    }
}