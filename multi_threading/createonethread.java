package multi_threading;

class multi extends Thread {
    public void run() {
        System.out.println("thread is running");
    }
}

public class createonethread {
    public static void main(String args[]) {
        multi m1 = new multi();
        m1.start();
    }
}