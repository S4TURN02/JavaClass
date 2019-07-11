package org.dimigo.interfaces;

public interface IAnimal {
    //상수(자동으로 public static final 붙음)
    String FARM_NAME = "디미 동물농장";

//    public abstract void eat();
//    abstract void sleep();
    void bark();

    default void eat() {
        System.out.println("냠냠");
    }

    default void sleep() {
        System.out.println("쿨쿨");
    }

    static void welcome() {
        System.out.println(FARM_NAME + "에 오신걸 환영합니다.");
    }
}
