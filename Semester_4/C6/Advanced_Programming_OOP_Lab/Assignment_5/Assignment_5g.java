package Assignment_5;

import static java.lang.System.out;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    public void takePhoto() {
        out.println("Taking a photo using the smartphone camera.");
    }

    public void playMusic() {
        out.println("Playing music on the smartphone.");
    }
}

public class Assignment_5g {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.playMusic();
    }
}