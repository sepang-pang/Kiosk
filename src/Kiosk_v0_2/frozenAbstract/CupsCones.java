package Kiosk_v0_2.frozenAbstract;

public class CupsCones extends AbstractFrozen {

    public double cupsConesPrice = 4.9;
    public String tasteCupsCones; // 컵 앤 콘 맛

    @Override
    public void choiceOption(int num) {
        displayMenu(); // 메뉴판
        boolean isRun = true;
        while (isRun) {
            switch (sc.nextInt()) {
                case 1:
                    cupsConesPrice = cupsConesPrice + getLargeCupsCones();
                    System.out.println("L 사이즈로 변경");
                    continue;

                case 2:
                    System.out.println("1. 바닐라        2. 초콜릿");
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
                    displayMenu();
                    continue;

                case 3:
                    System.out.println("종료");
                    isRun = false;
            }
        }
        System.out.println("컵 앤 콘 가격은 " + cupsConesPrice + " ( " + tasteCupsCones + " )");
    }
    public void displayMenu() {
        System.out.println("=========================");
        System.out.println("|" + " 1. 사이즈 업" + "  :   +1000원" + " |");
        System.out.println("|" + " 2. 맛     " + "  :   바닐라, 초콜릿" + " |");
        System.out.println("|" + " 3. 종    료" + "            |");
        System.out.println("=========================");
    }
}

