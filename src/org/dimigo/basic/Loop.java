package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] agrs)
    {
        //1. for문
        for(int i = 1; i < 10; i++)
        {
            for(int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\t", i, j, (i * j));
            }
            System.out.println();
        }

        //for-each문
        int [] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int value : arr) {
            System.out.println(value + " ");
        }

        //ITZY 멤버 출력
        String[] idol = {"예지", "유나", "채령", "류진", "리아"};
        for(String value : idol)
        {
            System.out.println(value + " ");
        }

        //while, do~while 문
        //메뉴 처리
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("<< 간식 선택 >>");
            System.out.println("1. 치킨");
            System.out.println("2. 냉면");
            System.out.println("3. 피자");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");

            menu = scanner.nextInt();

            switch(menu) {
                case 1:
                    System.out.println("치킨을 선택하셨습니다.");
                    break;
                case 2:
                    System.out.println("냉면을 선택하셨습니다.");
                    break;
                case 3:
                    System.out.println("피자를 선택하셨습니다.");
                    break;
                case 9:
                    System.out.println("종료");
                    scanner.close();
                    break;
                default:
                    System.out.println("잔류~!~!~!~!");
                    break;
            }
        } while(menu != 9);
    }
}
