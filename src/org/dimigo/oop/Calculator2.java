package org.dimigo.oop;

public class Calculator2 {
   /**********인스턴스 필드**********/
    private int num1;
    private int num2;
    private boolean powerflag;

    public boolean flag;
    public static double PI = 3.141592168;

    public void powerOn() {
       if(!flag) {
           System.out.println("전원을 켭니다.");
           flag = true;
       }
    }

    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    //정적 메소드(스태틱 메소드)
    public static int add(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 + num2;
    }

    public static int sub(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 - num2;
    }

    public static int mul(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 * num2;
    }

    public static double div(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return (double)num1 / num2;
    }
}
