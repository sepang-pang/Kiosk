package Kiosk_v0_2.drinkAbstract;

import java.util.Scanner;

public abstract class AbstractDrink {
    // ======================== 필드 ========================
    // 레몬네이드
    private double lemonade = 3.9;
    private double lemonadeLarge = 0.6;

    // 아이스티
    private double icedTea = 3.4;
    private double icedTeaLarge = 0.5;

    // 피프티
    private double fifty = 3.5;
    private double fiftyLarge = 0.9;

    // 공용
    private double addIce = 0.5;

    // ======================== GET ========================
    // get 레몬네이드
    public double getLemonadeLarge() {
        return lemonadeLarge;
    }

    // get 아이스티
    public double getIcedTeaLarge() {
        return icedTeaLarge;
    }

    // get 피프티
    public double getFiftyLarge() {
        return fiftyLarge;
    }

    // get 공용
    public double getAddIce() {
        return addIce;
    }

    // ======================== 생성자 ========================
    public AbstractDrink() {
        System.out.println("=========================");
        System.out.println("|" + "   음료수 선택   " + "|");
        System.out.println("=========================");
    }

    Scanner sc = new Scanner(System.in);

    // ======================= 추상메서드 =======================
    public abstract void choiceOption();

}
