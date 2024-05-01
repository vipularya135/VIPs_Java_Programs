package multi_threading;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even thread: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd thread: " + i);
        }
    }
}

public class co5_w3_q3 {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();

        try {
            evenThread.join();

            oddThread.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
