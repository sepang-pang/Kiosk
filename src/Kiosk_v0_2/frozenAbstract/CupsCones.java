package Kiosk_v0_2.frozenAbstract;

import Kiosk_v0_2.Cart;

public class CupsCones extends AbstractFrozen {
    private Cart cart; // Cart 클래스 참조
    public String tasteCupsCones; // 컵 앤 콘 맛

    public CupsCones(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void choiceOption() {
        displayMenuText(); // 메뉴판
        while (true) {
            switch (sc.nextInt()) {
                case 1:
                    cupsConesPrice += largeCupsCones;
                    size = "(L)";
                    System.out.println("L 사이즈로 변경");
                    continue;
                case 2:
                    System.out.println("1. 바닐라 2. 초콜릿");
                    switch (sc.nextInt()) {
                        case 1:
                            tasteCupsCones = "바닐라";
                            System.out.println("바닐라 맛으로 합니다.");
                            break;
                        case 2:
                            tasteCupsCones = "초콜릿";
                            System.out.println("초콜릿 맛으로 합니다.");
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            continue;
                    }
                    displayMenuText();
                    continue;

                case 3:
                    System.out.println("종료");
                    cart.addToCart("Cups & Cones", cupsConesPrice, tasteCupsCones, size);
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
        System.out.println("|" + " 1. 사이즈 업" + "  :   +1000원" + " |");
        System.out.println("|" + " 2. 맛     " + "  :   바닐라, 초콜릿" + " |");
        System.out.println("|" + " 3. 종    료" + "            |");
        System.out.println("=========================");
    }
}

