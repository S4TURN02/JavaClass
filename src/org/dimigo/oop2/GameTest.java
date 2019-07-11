package org.dimigo.oop2;

public class GameTest {
    public static void main(String[] args) {
        MediaPlayer mp = MediaPlayer.getInstance();
        System.out.println(mp.getVolume());

        new Player().play();
        System.out.println(mp.getVolume());
        new Enemy().enemy();
        System.out.println(mp.getVolume());
    }
}
