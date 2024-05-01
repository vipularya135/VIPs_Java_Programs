package multi_threading;

class hello extends Thread {
    public void run() {
        System.out.println("good morning");
        System.out.println("welcome");

    }
}
public class co5_w3_q1 {
    public static void main(String args[]){
        while(true) {
            hello m1 = new hello();
            m1.start();
        }
    }
}
