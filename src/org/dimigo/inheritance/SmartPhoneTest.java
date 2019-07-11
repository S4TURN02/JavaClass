package org.dimigo.inheritance;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone[] phones = {
                new iPhone("iPhone Xs","애플",1370000),
                new Galaxy("갤럭시 S10","삼성",1500000)
        };

        for(SmartPhone phone : phones) {
            System.out.println(phone);
            phone.turnOn();
            phone.pay();
            phone.useSpecialFunction();
            phone.turnOff();
            System.out.println();
        }
    }
}