package Kiosk_v0_2.drinkAbstract;

public class Lemonade extends AbstractDrink {

    public double lemonadePrice = 3.9;
    public String formLemonade;

    @Override
    public void choiceOption(int num) {
        boolean run = true;
        displayMenuText(); // 메뉴판 출력
        while (run) {

            switch (sc.nextInt()) {
                case 1:
                    lemonadePrice = lemonadePrice + getLemonadeLarge ();
                    System.out.println("L 사이즈로 변경");
                    continue;

                case 2:
                    lemonadePrice = lemonadePrice + getAddIce();
                    System.out.println("얼음 추가");
                    continue;

                case 3:
                    System.out.println("1. 오리지날  2. 시즈널");
                    switch (sc.nextInt()) {
                        case 1:
                            formLemonade = "오리지날";
                            System.out.println("오리지날로 합니다.");
                            break;
                        case 2:
                            formLemonade = "시즈널";
                            System.out.println("시즈널로 합니다.");
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            displayMenuText();
                            continue; // 선택지 외의 번호를 입력하면 case 3을 다시 실행하기
                    }
                    displayMenuText();
                    continue;

                case 4:
                    System.out.println("종료");
                    run = false;
            }
        }
        System.out.println("레모레이드 가격은 " + lemonadePrice + " ( " + formLemonade + " )");
    }

    public void displayMenuText() {
        System.out.println("=========================");
        System.out.println("|" + " 1. 사이즈 업" + "  :   + 600원" + " |");
        System.out.println("|" + " 2. 얼음 추가" + "  :   + 500원" + " |");
        System.out.println("|" + " 3. 맛     " + "  : 오리지날, 시즈널" + " |");
        System.out.println("|" + " 4. 종    료" + "            |");
        System.out.println("=========================");
    }
}
