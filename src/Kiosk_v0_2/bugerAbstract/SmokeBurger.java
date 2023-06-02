package Kiosk_v0_2.bugerAbstract;
import Kiosk_v0_2.Cart;

public class SmokeBurger extends AbstractBurgers {


    @Override
    public void choiceOption() {
        boolean run = true;
        int beefCount = 0;
        int cheeseCount = 0;
        while (run) {
            switch (sc.nextInt()) {
                case 1:
                    smokeShackPrice+= beefPrice;
                    beefCount++;
                    System.out.println("패티를 추가하였습니다.");
                    continue;

                case 2:
                    smokeShackPrice += cheesePrice;
                    cheeseCount++;
                    System.out.println("치즈를 추가하였습니다.");
                    continue;

                case 3:
                    System.out.println("종료");
                    cart.addToCart("Smoke Shack Burger", smokeShackPrice, "Beef " + beefCount + "장", "Cheese " + cheeseCount + "장");
                    cart.printCart();

                    System.out.println(" 위 메뉴를 장바구니에 추가하시겠습니까 ?");
                    System.out.println("1. 확인   2. 취소");

                    if (sc.nextInt() == 1) {
                        System.out.println("[ Smoke Shack ] 이 장바구니에 추가되었습니다.");
                        System.out.println();
                        kiosk.choiceShakeShake();
                    } else {
                        cart.clearCart();
                        kiosk.choiceShakeShake();
                    }

                    run = false;
                    break;
            }
        }
    }
}
