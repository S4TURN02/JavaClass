package org.dimigo.basic;

public class HelloWorld {
    public static void main(String[] args)
    {
        long month = 1700000L;
        long employee = 3L;
        long shop = 1500;

        System.out.println("<<디미벅스 연간 인건비>>");
        System.out.println("월 평균 급여 : "+ month + "원");
        System.out.println("점포 내 직원 수 : "+ employee + "명");
        System.out.println("점포 수 :"+ shop + "개\n");
        System.out.printf("연간 인건비 : %,d원", (month*employee*12*shop));
    }
}
