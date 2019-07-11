package org.dimigo.oop;

import java.util.*;


public class 자동차 {
    public 자동차() {
    }


    private int horsePower;


    private int maxSpeed;


    private long Price;


    private double fuelEfficiency;


    private String Company;


    public void forward() {
        System.out.println("전진합니다.");

    }


    public void backward() {
        System.out.println("후진합니다.");

    }


    public boolean stop() {
        // TODO implement here
        return false;
    }


    public void turnRight(int angle) {
        System.out.println("30도 우회전합니다.");

    }

    public void turnLeft(int angle) {
        // TODO implement here

    }

}