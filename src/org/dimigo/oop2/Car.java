package org.dimigo.oop2;

public class Car {
    //스태틱 필드
    private static String company;
    //인스턴스 필드
    private String name;

    static {
        company = "기아";
        System.out.println("static block called");
    }

    public Car(String name) {
        this.name = name;
        System.out.println("constructor called");
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return company + " : " + name;
    }
}
