package multi_threading;


class multi7 extends Thread {
    public void run() {
            try {
                Thread.sleep(500);
                System.out.println("is run() method alive " + Thread.currentThread().isAlive());
            } catch (InterruptedException ie) {
            }
        }
    }

public class isitalive {
    public static void main(String args[]) {
        multi7 m1 = new multi7();
        System.out.println("before starting thread is alive : " + m1.isAlive());

        m1.start();
        System.out.println("after starting thread is alive : " + m1.isAlive());


    }
}

