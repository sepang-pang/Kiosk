package Kiosk_v0_2.bugerAbstract;

import Kiosk_v0_2.Cart;
import Kiosk_v0_2.Kiosk;
import Kiosk_v0_2.Product;

import java.util.Scanner;

public abstract class AbstractBurgers {

    Product product = new Product();
    Kiosk kiosk = new Kiosk();
    Cart cart = new Cart();
    Double beefPrice = product.getBeefPrice();
    Double cheesePrice = product.getCheesePrice();
    Double shackBurgerPrice = product.getPriceShackeBurgerDouble();
    Double shroomBurgerPrice = product.getPriceShroomBurger();
    Double smokeShackPrice = product.getPriceSmokeShack();




    public AbstractBurgers () {

        System.out.println("=========================");
        System.out.println("|" + " 1. 패티 추가" + "  :   1000원" + " |");
        System.out.println("|" + " 2. 치즈 추가" + "  :    500원" + " |");
        System.out.println("|" + " 3. 종    료" + "            |");
        System.out.println("=========================");
    }
    Scanner sc = new Scanner(System.in);

    public abstract void choiceOption ();

}
