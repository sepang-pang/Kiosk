package Kiosk_v0_2.frozenAbstract;

import Kiosk_v0_2.Cart;

public class Shake extends AbstractFrozen {
    private Cart cart; // Cart 클래스 참조
    public String tasteShake; // 쉐이크 맛

    public Shake(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void choiceOption() {
        displayMenuText();
        while (true) {
            switch (sc.nextInt()) {
                case 1:
                    shakePrice += largeCupsCones;
                    size = "(L)";
                    System.out.println("L 사이즈로 변경");
                    continue;

                case 2:
                    System.out.println("1. 바닐라  2. 초콜릿  3. 스트로베리  4. 커피  5. 카라멜");
                    switch (sc.nextInt()) {
                        case 1:
                            tasteShake = "바닐라";
                            System.out.println("바닐라 맛으로 합니다.");
                            break;
                        case 2:
                            tasteShake = "초콜릿";
                            System.out.println("초콜릿 맛으로 합니다.");
                            break;
                        case 3:
                            tasteShake = "스트로베리";
                            System.out.println("스트로베리 맛으로 합니다.");
                            break;
                        case 4:
                            tasteShake = "커피";
                            System.out.println("커피 맛으로 합니다.");
                            break;
                        case 5:
                            tasteShake = "카라멜";
                            System.out.println("카라멜 맛으로 합니다.");
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            continue;
                    }
                    displayMenuText();
                    continue;

                case 3:
                    System.out.println("종료");
                    cart.addToCart("Shake", shakePrice, tasteShake, size);
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
        System.out.println("|" + " 2. 맛     " + "  : 바닐라, 초콜릿, 스트로베리, 커피, 카라멜" + " |");
        System.out.println("|" + " 3. 종    료" + "            |");
        System.out.println("=========================");
    }
}

