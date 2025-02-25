interface Audioplayer {
    static void play() {
        System.out.println("This is AP");
    }
}

interface Videoplayer {
    static void pause() {
        System.out.println("This is VP");
    }
}

interface Streamingplayer {
    void stop();
}

class Main implements Audioplayer, Videoplayer, Streamingplayer {

    public void stop() {
        System.out.println("This is SP");
    }

    public static void main(String args[]) {
        Audioplayer.play();
        Videoplayer.pause();
        Main obj = new Main();
        obj.stop();
    }
}
