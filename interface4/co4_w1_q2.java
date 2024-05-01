package interface4;


// Define the Playable interface
interface Playable {
    void play();
}

// Implement the Playable interface in the Football class
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

// Implement the Playable interface in the Volleyball class
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball");
    }
}

// Implement the Playable interface in the Basketball class
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

public class co4_w1_q2 {
    public static void main(String[] args) {
        // Create instances of each sport and call the play() method
        Football football = new Football();
        Volleyball volleyball = new Volleyball();
        Basketball basketball = new Basketball();

        // Demonstrate playing each sport
        football.play();
        volleyball.play();
        basketball.play();
    }
}
