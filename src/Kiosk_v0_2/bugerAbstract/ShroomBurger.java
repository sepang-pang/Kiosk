package Kiosk_v0_2.bugerAbstract;

public class ShroomBurger extends AbstractBurgers {

    @Override
    public void choiceOption() {

        boolean run = true;
        while (run) {
            switch (sc.nextInt()) {
                case 1:
                    shroomBurgerPrice = shroomBurgerPrice + beefPrice;
                    System.out.println("패티를 추가하였습니다.");
                    break; // 현재 반복 종료 후 다음 반복 진행 (while문으로 돌아가게 됨)

                case 2:
                    shroomBurgerPrice = shroomBurgerPrice + cheesePrice;
                    System.out.println("치즈를 추가하였습니다.");
                    break;

                case 3:
                    System.out.println("종료");
                    run = false;
                    break;
            }
        }
        System.out.println("슈룸버거 가격은 " + shroomBurgerPrice);
    }
}
