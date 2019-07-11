package org.dimigo.oop2;

public class SingletorTest {
    public static void main(String[] args) {
        Singletor s1 = Singletor.getInstance();
        Singletor s2 = Singletor.getInstance();

        System.out.println(s1 == s2);
    }
}
