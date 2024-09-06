abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    public void play() {
        System.out.println("Piano is playing");
    }
}

class Flute extends Instrument {
    public void play() {
        System.out.println("Flute is playing");
    }
}

class Guitar extends Instrument {
    public void play() {
        System.out.println("Guitar is playing");
    }
}

public class P7 {
    public static void main(String[] args) {
        Instrument[] ins = new Instrument[10];
        for (int i = 0; i < 7; i += 3) {
            ins[i] = new Piano();
            ins[i + 1] = new Flute();
            ins[i + 2] = new Guitar();
        }
        ins[9] = new Piano();

        for (Instrument i: ins) i.play();
    }
}
