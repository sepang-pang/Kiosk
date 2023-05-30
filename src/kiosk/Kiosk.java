package kiosk;

import java.util.Scanner;

public class Kiosk {
    // 필드
    public AbstractProduct product;

    // 생성자

    public Kiosk (AbstractProduct product) {
        this.product = product;
    }

    Scanner sc = new Scanner(System.in);
    public boolean orderStatus() {
        System.out.println("종업원: 주문하시겠습니까? (Y/N)");
        String answerChar = sc.nextLine();
        return answerChar.equals("Y");
    }

    public void americanoValue(int productNum) {

        System.out.println("=========================");
        System.out.println("|" + " 1. 얼음 추가" + "  :    500원" +" |");
        System.out.println("|" + " 2. 사이즈 업" + "  :   1000원" +" |");
        System.out.println("|" + " 3. 시럽 추가" + "  :   1000원" +" |");
        System.out.println("|" + " 4. 종    료" + "            |");
        System.out.println("=========================");

        switch (productNum) {

            case 1:
                product.choiceOption(productNum);
                break;
            case 2:
                System.out.println("e1323");
                break;
            case 3:
                System.out.println("Dads");
                break;
        }
    }
}
