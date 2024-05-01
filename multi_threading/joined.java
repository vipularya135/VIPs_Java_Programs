package multi_threading;


class multi6 extends Thread {
    public void run() {
        System.out.println("thread is running raa");
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class joined {
    public static void main(String args[]) {
        multi6 m1 = new multi6();
        multi6 m2 = new multi6();
        multi6 m3 = new multi6();

        m1.start();
        try {
        m1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        m2.start();
        m3.start();
    }
}

