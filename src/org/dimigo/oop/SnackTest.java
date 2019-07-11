package org.dimigo.oop;

import java.util.Scanner;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snackArr = {new Snack("새우깡", "농심", 1100, 2),
        new Snack("콘칲", "크라운", 1200, 1), new Snack("허니버터칩", "해태", 1500, 4)};

        printArray(snackArr);

        int sum = 0;

        for(int i = 0; i < 3; i++)
        {
            sum += snackArr[i].calcPrice();
        }

        System.out.printf("총 구매 금액 : %,d원", sum);
    }

    private static void printArray(Snack[] snackArr) {
        System.out.println();
        for(Snack value : snackArr) {
            System.out.print(value);
        }
        System.out.println();
    }
}
