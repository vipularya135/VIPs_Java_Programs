package multi_threading;


class multi5 extends Thread {
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
public class slept {
    public static void main(String args[]) {
        multi5 m1 = new multi5();
        multi5 m2 = new multi5();
        multi5 m3 = new multi5();

        m1.start();
        m2.start();
        m3.start();

    }
}

