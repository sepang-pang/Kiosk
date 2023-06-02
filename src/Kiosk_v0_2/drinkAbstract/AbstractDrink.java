package Kiosk_v0_2.drinkAbstract;

import Kiosk_v0_2.Product;
import Kiosk_v0_2.Kiosk;

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

    String size = "(R)";


    // ======================== 생성자 ========================
    public AbstractDrink() {

        System.out.println("=========================");
        System.out.println("|" + "     DRINK  OPTION     " + "|");
        System.out.println("=========================");


    }


    Scanner sc = new Scanner(System.in);

    // ======================= 추상메서드 =======================
    public abstract void choiceOption();

}
