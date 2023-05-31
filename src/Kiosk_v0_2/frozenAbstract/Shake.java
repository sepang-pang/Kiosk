package Kiosk_v0_2.frozenAbstract;

public class Shake extends AbstractFrozen {
    public double shakePrice = 4.9;
    public String tasteShake; // 컵 앤 콘 맛

    @Override
    public void choiceOption() {
        displayMenu();
        boolean isRun = true;
        while (isRun) {
            switch (sc.nextInt()) {
                case 1:
                    shakePrice = shakePrice + getLargeCupsCones();
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
                    displayMenu();
                    continue;

                case 3:
                    System.out.println("종료");
                    isRun = false;
            }
        }
        System.out.println("쉐이크 가격은 " + shakePrice + " ( " + tasteShake + " )");
    }
    public void displayMenu() {
        System.out.println("=========================");
        System.out.println("|" + " 1. 사이즈 업" + "  :   +1000원" + " |");
        System.out.println("|" + " 2. 맛     " + "  : 바닐라, 초콜릿, 스트로베리, 커피, 카라멜" + " |");
        System.out.println("|" + " 3. 종    료" + "            |");
        System.out.println("=========================");
    }
}

