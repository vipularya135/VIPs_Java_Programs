package multi_threading;

class multi1 implements Runnable {
    public void run(){
        System.out.println("thread is running raa");
    }
}

public class create_thread_runnable {
    public static void main(String args[]) {
        multi1 v = new multi1();
        Thread vt = new Thread(v);
        vt.start();
    }
}
