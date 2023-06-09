package Kiosk_v0_2.frozenAbstract;

import Kiosk_v0_2.Cart;

public class Concreates extends AbstractFrozen {

    private Cart cart; // Cart 클래스 참조
    public String formConcreates; // 콘크리트 형태


    public Concreates(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void choiceOption() {
        displayMenuText();
        while (true) {
            switch (sc.nextInt()) {
                case 1:
                    concreatesPrice += largeConcretes;
                    size = "(L)";
                    System.out.println("L 사이즈로 변경");
                    continue;

                case 2:
                    System.out.println("1. 쉑 어택  2. 허니버터 크런치  3. 베러 게더");
                    switch (sc.nextInt()) {
                        case 1:
                            formConcreates = "쉑 어택";
                            System.out.println("쉑 어택으로 합니다.");
                            break;
                        case 2:
                            formConcreates = "허니버터 크런치";
                            System.out.println("허니버터 크런치로 합니다.");
                            break;
                        case 3:
                            formConcreates = "베러 게더";
                            System.out.println("베러 게더로 합니다.");
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            continue;
                    }
                    displayMenuText();
                    continue;

                case 3:
                    System.out.println("종료");
                    cart.addToCart("Concreates", concreatesPrice, formConcreates, size);
                    cart.printCart();
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
        System.out.println("|" + " 1. 사이즈 업" + "  :   +3000원" + " |");
        System.out.println("|" + " 2. 맛     " + "  : 쉑 어택, 허니버터 크런치, 베러 게더" + " |");
        System.out.println("|" + " 3. 종    료" + "            |");
        System.out.println("=========================");
    }
}
