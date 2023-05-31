package Kiosk_v0_2;


import java.util.Scanner;

public class Kiosk {

    Employee employee = new Employee(); // 직원 객체
    Screen screen = new Screen(); // 스크린 객체
    Menu message = new Menu();
    AddOption addOption = new AddOption();
    boolean isTrue = employee.employee(); // 논리형 타입 대입
    Scanner scanner = new Scanner(System.in);


    public Kiosk() {
    }

    public void kioskRun() {
        if (isTrue) {
            screen.initialScreen();
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
                        screen.initialScreen();
                    default:
                        System.out.println(message.choiceErrorMessage);
                        continue;
                }
                break;
            }
        } // < ==== 반복문 종료 === >
    } // < ==== kioskRun 종료 ==== >

    public void choiceShakeShake() {
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
                default:
                    System.out.println(message.errorInputMassage);
                    continue;
            }
            break;
        }
    }
}

