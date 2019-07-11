package org.dimigo.oop2;

public class PiggybankTest {
    public static void main(String[] args) {
        FamilyMember father = new FamilyMember("아빠");
        FamilyMember mother = new FamilyMember("엄마");
        FamilyMember I = new FamilyMember("나");
        FamilyMember brother = new FamilyMember("남동생");

        FamilyMember.printMemberCnt();

        Piggybank.putMoney(father, 10000);
        Piggybank.putMoney(mother, 5000);
        Piggybank.putMoney(I, 2000);
        Piggybank.putMoney(brother, 1000);

        Piggybank.printBalance();

        Piggybank.putMoney(I, 1000);

        Piggybank.printBalance();
    }
}
