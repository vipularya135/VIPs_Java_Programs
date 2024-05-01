package multi_threading;

class Hello1 extends Thread {
    public void run() {
        System.out.println("Thread is running raa");
        while (true) {
            try {
                System.out.println("Good morning");
                System.out.println("Welcome");
                Thread.sleep(5000); // Sleep for 5 seconds before printing again

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class co5_w3_q2 {
    public static void main(String args[]) {
        Hello1 m1 = new Hello1();
        m1.start(); // Start the thread
    }
}
