package Assignment_4;

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing piano");
    }
}

public class Assignment_4r {
    public static void main(String[] args) {

        // Direct objects
        Guitar g = new Guitar();
        Piano p = new Piano();

        System.out.println("Direct Calls:");
        g.play();
        p.play();

        // Interface reference (Polymorphism)
        System.out.println("\nInterface Reference Calls:");

        Playable ref;

        ref = new Guitar();
        ref.play();

        ref = new Piano();
        ref.play();
    }
}