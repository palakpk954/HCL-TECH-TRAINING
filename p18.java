interface Camera18 {
    void takePhoto();
}

interface MusicPlayer18 {
    void playMusic();
}

class Smartphone18 implements Camera18, MusicPlayer18 {
    @Override
    public void takePhoto() {
        System.out.println("Smartphone takes a photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone plays music");
    }
}

public class p18 {
    public static void main(String[] args) {
        Smartphone18 phone = new Smartphone18();
        phone.takePhoto();
        phone.playMusic();
    }
}
