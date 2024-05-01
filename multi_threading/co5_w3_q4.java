package multi_threading;

import java.util.Arrays;

class searching extends Thread {
    public void run() {
        System.out.println("Searching thread executing.");
        int[] array = {4, 2, 7, 1, 9, 3, 6};
        int key = 7;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + key + " found in the array.");
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}

class sorting extends Thread {
    public void run() {
        System.out.println("Sorting thread executing.");
        int[] array = {4, 2, 7, 1, 9, 3, 6, -1};
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

public class co5_w3_q4 {
    public static void main(String[] args) {
        sorting m1 = new sorting();
        searching m2 = new searching();

        m1.start();
        m2.start();

        try {
            m1.join();
            m2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
