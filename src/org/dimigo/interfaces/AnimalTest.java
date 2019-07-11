package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        IAnimal[] animals = {new Dog(), new Cat()};

        IAnimal.welcome();
        for(IAnimal a : animals) {
            a.eat();
            a.sleep();
            a.bark();

            if(a instanceof Dog)
                ((Dog) a).wag();
        }
    }
}
