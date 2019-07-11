package org.dimigo.inheritance;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }
    public void bark() {
        System.out.println("어흥");
    }
    public void hunt() {
        System.out.println("냠");
    }
}
