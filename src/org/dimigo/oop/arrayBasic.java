package org.dimigo.oop;

public class arrayBasic {
    public static void main(String[] args) {
        //기본형 : int, long, double, char, float, boolean, short
        //참조형 : String, Book, Car, Scanner, Random, StringBuilder
        Car car = null;

        int[] intArr = null;
        intArr = new int[5];

        for(int value : intArr) {
            System.out.print(value + " ");
        }
        printArray(intArr);

        double[] doubleArr = new double[5];
        for(double d : doubleArr)
        {
            System.out.print(d + " ");
        }
        System.out.println();

        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = new int[] {1, 2, 3, 4, 5};

        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "BTS";
        strArr[1] = "EXO";
        strArr[2] = "볼빨간사춘기";

        printArray(strArr);

        String[] Arr2 = {"BTS", "EXO", "트와이스"};
        String[] Arr3 = new String[] {"BTS", "EXO", "트와이스"};
        printArray(Arr2);

        Book book = new Book();
        Book book1 = new Book();

        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블", "김재영", 100);
        bookArr[1] = new Book("워드마스터", "전유원", 200);

        printArray(bookArr);

        Book[] bookArr2 = {new Book("수학의 바이블", "김재영", 100), new Book("워드마스터", "전유원", 200)};

        printArray(bookArr2);

        int[] intArr4 = null;
        System.out.println(intArr4.length);

        intArr4 = new int[3];
        System.out.println(intArr4[intArr4.length - 1]);

        String[] strArr4 = new String[3];
        System.out.println(strArr4[0].length());

        Book[] bookArr3 = new Book[3];

        String[] strArr5 = null;
        strArr5 = new String[] {"수학", "영어", "국어"};

    }


    private static void printArray(double[] doubleArr) {
        System.out.println();
        for(double value : doubleArr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
        System.out.println();
        for(int value : intArr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void printArray(String[] strArr) {
        System.out.println();
        for(String value : strArr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void printArray(Book[] bookArr) {
        System.out.println();
        for(Book value : bookArr) {
            System.out.println(value);
        }
        System.out.println();
    }
}
