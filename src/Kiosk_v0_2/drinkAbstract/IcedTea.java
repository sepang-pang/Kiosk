package Kiosk_v0_2.drinkAbstract;

import Kiosk_v0_2.Cart;
import Kiosk_v0_2.Kiosk;

public class IcedTea extends AbstractDrink {

    private Cart cart; // Cart 클래스 참조
    public SaveCart saveCart = new SaveCart();

    public IcedTea(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void choiceOption() {
        displayMenuText();
        int addIceCount = 0;

        while (true) {

            switch (sc.nextInt()) {
                case 1:
                    icedTeaPrice += icedTeaLarge;
                    size = "(L)";
                    System.out.println("L 사이즈로 변경");
                    continue;

                case 2:
                    icedTeaPrice += addIce;
                    addIceCount++;
                    System.out.println("얼음 추가");
                    continue;

                case 3:
                    System.out.println("종료");
                    cart.addToCart("Fresh Brewed Iced Tea", icedTeaPrice, size, "얼음 추가 : " + addIceCount + "번");
                    saveCart.saveCart();
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
                    displayMenuText();
                    continue;
            }
            break;

        }


    }


    public void displayMenuText() {
        System.out.println("=========================");
        System.out.println("|" + " 1. 사이즈 업" + "  :   + 500원" + " |");
        System.out.println("|" + " 2. 얼음 추가" + "  :   + 500원" + " |");
        System.out.println("|" + " 3. 종    료" + "            |");
        System.out.println("=========================");
    }

}
