package Kiosk_v0_2.drinkAbstract;

import Kiosk_v0_2.Product;

import java.util.Scanner;

public abstract class AbstractDrink {
    Product product = new Product();


    double lemonadePrice = product.getPriceLemonade();
    double icedTeaPrice = product.getPriceIcedTea();
    double fiftyPrice = product.getPriceFifty();


    // ======================== 필드 ========================
    // 레몬네이드

    double lemonadeLarge = product.getLemonadeLarge();

    // 아이스티
    double icedTeaLarge = product.getIcedTeaLarge();

    // 피프티
    double fiftyLarge = product.getFiftyLarge();

    // 공용
    double addIce = product.getAddIce();

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
