package Kiosk_v0_2.bugerAbstract;

import java.util.Scanner;

public abstract class AbstractBurgers {
    private double beefPrice = 1.0;
    private double cheesePrice = 0.5;

    public double getBeefPrice() {
        return beefPrice;
    }
    public double getCheesePrice() {
        return cheesePrice;
    }

    public AbstractBurgers () {
        System.out.println("=========================");
        System.out.println("|" + " 1. 패티 추가" + "  :   1000원" + " |");
        System.out.println("|" + " 2. 치즈 추가" + "  :    500원" + " |");
        System.out.println("|" + " 3. 종    료" + "            |");
        System.out.println("=========================");
    }


    Scanner sc = new Scanner(System.in);

    public abstract void choiceOption (int num);

}
