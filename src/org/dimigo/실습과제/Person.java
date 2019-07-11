package org.dimigo.실습과제;

public class Person {
    private String name;

    public Person() {}
    public Person(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayBye() {
        System.out.println("Bye");
    }

    @Override
    public String toString() {
        return "저는 " + getName() + "입니다";
    }
}
