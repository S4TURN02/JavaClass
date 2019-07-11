package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args)
    {
        String str = "디미고";
        str += "2학년";
        str += "5반";
        str += "왕태규";

        StringBuilder sb = new StringBuilder("디미고");
        sb.append("2학년 ").append("5반 ").append("왕태규");
    }

    private static void compareSpeed() {
        long start = System.currentTimeMillis();
        String str = "abc";
        for(int i = 0; i <100000; i++) {
            str += "def";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
