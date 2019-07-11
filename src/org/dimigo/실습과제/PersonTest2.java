package org.dimigo.실습과제;

public class PersonTest2 {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for(Person person : people) {
            greetings(person);
        }
    }

    private static void greetings(Person person) {
        System.out.println(person);
        person.sayHello();
        person.sayBye();
    }
}
