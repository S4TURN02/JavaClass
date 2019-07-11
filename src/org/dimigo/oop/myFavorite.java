package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class myFavorite {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String answer;
        int menu;
        String[] myAnswer = {"아이유", "원빈", "자료구조"};
        String[] question = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 배우는?"};
        boolean exit = false;
        StringBuilder sb = new StringBuilder("");
        for(int j = 0; j < 3; j++)
            sb.append("\n").append(question[j] ).append(myAnswer[j] ).append("입니다.\n");

       do {
           System.out.println("---------------------");
           System.out.println("1. 질문 선택");
           System.out.println("2. 정답 공개");
           System.out.println("9. 프로그램 종료");
           System.out.println("---------------------");
           System.out.println("메뉴 선택 => ");
           menu = scanner.nextInt();
          switch(menu)
          {
              case 1:
                  int i = new Random().nextInt(2) + 1;
                  System.out.printf(question[i]);
                  answer = scanner.next();
                  if(answer.equals(myAnswer[i]))
                      System.out.println("정답입니다!");
                  else
                      System.out.println("틀렸습니다!");
                  break;

              case 2:

                  System.out.println("<< 정답 출력 >>");
                  System.out.println(sb);

                  break;

              case 9:
                 exit = true;
                 System.out.println("Bye~");
                 break;
              default:
                  System.out.println("없는 메뉴입니다.");
                  break;


          }
       }while(!exit);

    }
}
