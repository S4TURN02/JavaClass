package org.dimigo.inheritance;

public class iPhone extends SmartPhone{
    public iPhone() {
    }

    public iPhone(String model, String company, int price) {
        super(model, company, price);
    }

    public void pay() {
        System.out.println("삼성 페이로 결제합니다.");
    }

    public void useAirDrop() {
        System.out.println("AirDrop 기능을 사용합니다.");
    }
}
