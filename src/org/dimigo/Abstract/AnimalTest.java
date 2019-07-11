package org.dimigo.Abstract;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new duck(), new pig(), new co()
        };

        System.out.println("=== 평온한 동물농장 ===");
        for(Animal a : animals) {
            a.eat();
        }

        System.out.println("=== 늑대가 나타났다 ===");
        for(Animal a : animals) {
            a.bark();
        }
    }
}