package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        int a = 5, b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println((double)a / b);

        int i = 10;
        double d = 3.14;
        int r1 = (int)(i + d);
        double r2 = i + d;

        short s1 = 1, s2 = 2;
        short r3 = (short)(s1 + s2);
        int r4 = s1 + s2;

        //Short Circuit Test
        boolean flag = true;
        a = 10;
        b = 0;
        if(flag || (a / b == 0))
        {
            System.out.println("OR 연산");
        }
        if(!flag && (a / b == 0))
        {
            System.out.println("AND 연산");
        }
        //문자열 연결 연산
        String school = "디미고";
        int grade = 2;
        int ban = 5;
        String name  = "이규형";

        System.out.println(school + grade + ban + name);
        System.out.println(grade + ban + school + name);

//        25이규형 출력하려면
        System.out.println(grade + (ban + school) + name);
    }
}
