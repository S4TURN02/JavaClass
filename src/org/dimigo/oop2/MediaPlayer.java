package org.dimigo.oop2;

public class MediaPlayer {
    private int volume;
    private static MediaPlayer instance = new MediaPlayer();

    private MediaPlayer() { }

    public static  MediaPlayer getInstance() {
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public static void setInstance(MediaPlayer instance) {
        MediaPlayer.instance = instance;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
