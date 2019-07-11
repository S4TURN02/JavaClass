package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args)
    {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        String[] character = {"마법사", "영주", "기사", "농민"};
        int[] atk = {100, 100, 100, 100};
        System.out.println(new Random().nextInt(3) + 1);
        int num = new Random().nextInt(3) + 1;
        int ghkr = num;
        int flag = 0;
        do {
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("---------------");
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");
            System.out.print("메뉴 입력 => ");

            menu = scanner.nextInt();

            switch(menu) {
                case 1:
                    System.out.println(character[ghkr]+"(으)로 설정되었습니다.");
                    System.out.println("------------------");
                    flag = 1;
                    break;
                case 2:
                    if(flag != 1) {
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    }
                    atk[ghkr] += 10;
                    System.out.println(character[ghkr]+" 공격력이 증가되었습니다. 현재 공격력 : "+atk[ghkr]);
                    break;
                case 3:
                    if(flag != 1) {
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    }
                    atk[ghkr] -= 10;
                    System.out.println(character[ghkr]+" 공격력이 감소되었습니다. 현재 공격력 : "+atk[ghkr]);
                    break;
                case 9:
                    flag = 0;
                    ghkr = 0;
                    System.out.println("이제 공부하세요!");
                    scanner.close();
                    break;
                default:
                    System.out.println("");
                    break;
            }
        } while(menu != 9);
    }
}
