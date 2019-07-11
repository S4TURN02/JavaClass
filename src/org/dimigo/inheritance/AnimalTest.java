package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d = new Dog("백구");
        System.out.println(d);
        d.eat();
        d.wag();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();
        c.scratch();

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();
        t.hunt();

        Animal d2 = new Dog("멍멍이2");
        Animal d3 = new Cat("야옹이2");
        Animal d4 = new Tiger("호돌이2");
        d2.bark();
        d3.bark();
        d4.bark();

        Animal[] animals = {
          new Dog("멍멍이"),
                new Cat("야옹이"),
          new Tiger("호돌이")
        };
        for(Animal animal : animals) {
            System.out.println(animal);
            doBark(animal);
        }

        Animal a2 = new Cat("야옹이");
        Cat cat = (Cat)a2;

        ((Cat)a2).scratch();

        Animal dog = new Dog("멍멍이");
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Dog);
    }

    private static void doBark(Animal animal) {
        Cat c = (Cat) animal;
        c.scratch();
    }
}
