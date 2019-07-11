package org.dimigo.oop;

public class CarTest3 {
    public static void main(String[] agrs) {
        Car3 car1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);


        System.out.println("제조사명 : "+car1.getCompany());
        System.out.println("모델명 : "+car1.getModel());
        System.out.println("색상 : "+car1.getColor());
        System.out.println("최대속도 : "+car1.getMasSpeed()+"km");
        System.out.printf("가격 : %,d원", car1.getPrice());
        System.out.println("");

        Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);

        System.out.println("제조사명 : "+car2.getCompany());
        System.out.println("모델명 : "+car2.getModel());
        System.out.println("색상 : "+car2.getColor());
        System.out.println("최대속도 : "+car2.getMasSpeed()+"km");
        System.out.printf("가격 : %,d원", car2.getPrice());
        System.out.println("");

        Car3 car3 = new Car3("삼성자동차", "SM7", "회색");


        System.out.println("제조사명 : "+car3.getCompany());
        System.out.println("모델명 : "+car3.getModel());
        System.out.println("색상 : "+car3.getColor());
        System.out.println("최대속도 : "+car3.getMasSpeed()+"km");
        System.out.printf("가격 : %,d원", car3.getPrice());
        System.out.println("");

    }
}
