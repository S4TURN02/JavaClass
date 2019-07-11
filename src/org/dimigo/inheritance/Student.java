package org.dimigo.inheritance;

public class Student extends Person {
    private String studentID;

    public Student(String name, int age, int height, int weight, String studentID) {
        super(name, age, height, weight);
        this.studentID = studentID;
    }

    public void studyAtNight() {
        System.out.println(getName() + "이/가 야자를 한다.");
    }

    public void rollCall() {
        System.out.println(getName() + "이/가 점호를 한다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                super.toString();
    }
}
