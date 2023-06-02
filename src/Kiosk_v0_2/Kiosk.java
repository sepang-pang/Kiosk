package Kiosk_v0_2;


import java.util.Scanner;

public class Kiosk {



    Screen screen = new Screen(); // 스크린 객체
    Menu message = new Menu();
    AddOption addOption = new AddOption();
    Scanner scanner = new Scanner(System.in);
    Cart cart = new Cart();


    public void kioskRun() {
        System.out.println("========== 쉑쉑버거 ==========");
        System.out.println("안녕하세요!! 쉑쉑버거입니다!!");
        System.out.println("종업원: 주문하시겠습니까? (Y/N)");
        if (scanner.nextLine().equals("Y")) {
            choiceShakeShake();
        } else {
            System.out.println("주문을 취소하시겠습니까? ( Y / N )");
            System.out.println("Y : 종료     N : 주문 진행");
            while (true) {
                switch (scanner.nextLine()) {
                    case "Y":
                        System.out.println("안녕 가십시오.");
                        break;
                    case "N":
                        kioskRun();
                    default:
                        System.out.println(message.choiceErrorMessage);
                        continue;
                }
                break;
            }
        } // < ==== 반복문 종료 === >
    } // < ==== kioskRun 종료 ==== >

    public void choiceShakeShake() {
        screen.initialScreen();
        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    screen.burgersScreen();
                    addOption.addBugersOption();
                    break;
                case 2:
                    screen.frozenScreen();
                    addOption.addFrozenOption();
                    break;
                case 3:
                    screen.drinksScreen();
                    addOption.addDrinkOption();
                    break;
                case 4:
                    cart.printCart();
                    cart.printTotalPrice();
                    break;
                default:
                    System.out.println(message.errorInputMassage);
                    continue;
            }
            break;
        }
    }
}

