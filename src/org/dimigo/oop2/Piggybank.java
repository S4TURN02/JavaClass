package org.dimigo.oop2;

 public class Piggybank {
    private static int balance;

    public static void putMoney(FamilyMember member, int amount) {
        System.out.printf("%s : %,d원 넣음", member.getMemberName(), amount);
        balance += amount;
    }

    public static void printBalance() {
        System.out.println("돼지저금통 총 금액 : " + balance + "원");
    }
}

