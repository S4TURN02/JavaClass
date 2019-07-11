package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] agrs)
    {
        //1. if~else
        //2.선거권 연령 : 만 19세
        int age = 17;
        //19세 이상이면 "투표하러 가세요"
        //아니면 "선거권이 없네요"
        if(age > 19)
        {
            System.out.println("투표하러 가세요");
        }
        else
            System.out.println("선거권이 없네요");

        //2.switch
        //주사위 랜덤 뽑기
        System.out.println(new Random().nextInt(6) + 1);
        int num = new Random().nextInt(6) + 1;
        switch(num % 2)
        {
            case 0:
                System.out.println("짝수입니다");
                break;
            case 1:
                System.out.println("홀수입니다");
                break;
            default:
                System.out.println("누구냐, 넌!");
        }

        String menu = "떡볶이";

        switch (menu)
        {
            case "떡볶이":
                System.out.println("떡볶이 선택");
                break;
            case "순대":
                System.out.println("순대 선택");
                break;
            default:
                System.out.println("다이어트 중");
        }

    }
}
